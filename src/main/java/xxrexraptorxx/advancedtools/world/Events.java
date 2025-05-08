package xxrexraptorxx.advancedtools.world;

import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ResolvableProfile;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.VersionChecker;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.RenderTooltipEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import xxrexraptorxx.advancedtools.items.CustomAxeItem;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModComponents;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.advancedtools.utils.sockets.SocketTooltipComponent;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = References.MODID, bus = EventBusSubscriber.Bus.GAME)
public class Events {

    /** Update Checker **/
    private static boolean hasShownUp = false;

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Pre event) {
        if (Config.UPDATE_CHECKER != null && Config.UPDATE_CHECKER.get()) {

            if (!hasShownUp && Minecraft.getInstance().screen == null) {
                var player = Minecraft.getInstance().player;
                if (player == null) return;

                var modContainer = ModList.get().getModContainerById(References.MODID).orElse(null);

                if (modContainer != null) {
                    var versionCheckResult = VersionChecker.getResult(modContainer.getModInfo());

                    if (versionCheckResult.status() == VersionChecker.Status.OUTDATED || versionCheckResult.status() == VersionChecker.Status.BETA_OUTDATED) {
                        MutableComponent url = Component.translatable(ChatFormatting.GREEN + "Click here to update!")
                                .withStyle(style -> style.withClickEvent(new ClickEvent.OpenUrl(URI.create(References.URL))));

                        player.displayClientMessage(Component.literal(ChatFormatting.BLUE + "A newer version of " + ChatFormatting.YELLOW + References.NAME + ChatFormatting.BLUE + " is available!"), false);
                        player.displayClientMessage(url, false);

                        hasShownUp = true;

                    } else if (versionCheckResult.status() == VersionChecker.Status.FAILED) {
                        AdvancedTools.LOGGER.error(References.NAME + "'s version checker failed!");
                        hasShownUp = true;
                    }
                }
            }
        }
    }


    private static final HttpClient HTTP_CLIENT = HttpClient.newHttpClient();

    /**
     * Distributes supporter rewards on first login.
     */
    @SubscribeEvent
    public static void SupporterRewards(PlayerEvent.PlayerLoggedInEvent event) {
        Player player = event.getEntity();
        Level level = player.level();

        if (Config.PATREON_REWARDS != null && Config.PATREON_REWARDS.get()) {
            // Check if the player already has rewards
            if (!player.getInventory().contains(new ItemStack(Items.PAPER))) {
                if (player instanceof ServerPlayer serverPlayer) { // Ensure the player is a ServerPlayer
                    // Check if the player is logging in for the first time
                    if (serverPlayer.getStats().getValue(Stats.CUSTOM, Stats.PLAY_TIME) < 5) {

                        // Perform supporter checks asynchronously
                        CompletableFuture.runAsync(() -> {
                            if (SupporterCheck(URI.create("https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Supporter"), player)) {
                                giveSupporterReward(player, level);
                            }
                            if (SupporterCheck(URI.create("https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Premium%20Supporter"), player)) {
                                givePremiumSupporterReward(player, level);
                            }
                            if (SupporterCheck(URI.create("https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Elite"), player)) {
                                giveEliteReward(player);
                            }
                        });
                    }
                }
            }
        }
    }


    /**
     * Checks if the player is in the supporter list from the given URI.
     *
     * @param uri URI to a file containing supporter names
     * @param player The in-game player
     * @return true if the player is a supporter, otherwise false
     */
    private static boolean SupporterCheck(URI uri, Player player) {
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();
            HttpResponse<String> response = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

            // Parse supporter list
            List<String> supporterList = List.of(response.body().split("\\R"));
            return supporterList.contains(player.getName().getString());

        } catch (Exception e) {
            AdvancedTools.LOGGER.error("Failed to fetch or process supporter list from URI: {}", uri, e);
            return false;
        }
    }


    private static void giveSupporterReward(Player player, Level level) {
        ItemStack certificate = new ItemStack(Items.PAPER);
        certificate.set(DataComponents.CUSTOM_NAME, Component.literal("Thank you for supporting me in my work!").withStyle(ChatFormatting.GOLD)
                .append(Component.literal(" - XxRexRaptorxX").withStyle(ChatFormatting.ITALIC).withStyle(ChatFormatting.GREEN)));

        ItemStack reward = new ItemStack(Items.PLAYER_HEAD);
        var profile = new GameProfile(player.getUUID(), player.getName().getString());
        reward.set(DataComponents.PROFILE, new ResolvableProfile(profile));

        level.playSound(null, player.blockPosition(), SoundEvents.PLAYER_LEVELUP, SoundSource.PLAYERS, 0.5F, level.random.nextFloat() * 0.15F + 0.8F);
        player.getInventory().add(reward);
        player.getInventory().add(certificate);
    }


    private static void givePremiumSupporterReward(Player player, Level level) {
        ItemStack reward = new ItemStack(Items.DIAMOND_SWORD, 1);
        Registry<Enchantment> enchantmentsRegistry = level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT);

        reward.enchant(enchantmentsRegistry.getOrThrow(Enchantments.MENDING), 1);
        reward.enchant(enchantmentsRegistry.getOrThrow(Enchantments.SHARPNESS), 3);
        reward.set(DataComponents.ENCHANTMENTS, reward.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY));
        player.getInventory().add(reward);
    }


    private static void giveEliteReward(Player player) {
        ItemStack star = new ItemStack(Items.NETHER_STAR);

        star.set(DataComponents.CUSTOM_NAME, Component.literal("Elite Star"));
        player.getInventory().add(star);
    }


    /**
     * Adds tooltips to tools with stick variant.
     **/
    @SubscribeEvent
    public static void addingToolTips(ItemTooltipEvent event) {
        Item item = event.getItemStack().getItem();
        String namespace = BuiltInRegistries.ITEM.getKey(item).getNamespace();
        String name = BuiltInRegistries.ITEM.getKey(item).getPath();

            if (!ToolUtils.excludedMods(namespace) && item.components().has(DataComponents.TOOL) && ToolUtils.isToolType(name)) {

                if (namespace.equals(References.MODID)) {
                    if (Screen.hasShiftDown() && Config.SHOW_MATERIAL_STATS.get()) {
                        event.getToolTip().add(2, ToolUtils.getToolStatDescription(Objects.requireNonNull(ToolUtils.getPartsFromTool(name))[0], Objects.requireNonNull(ToolUtils.getPartsFromTool(name))[1]));
                        event.getToolTip().add(3, Component.empty());

                    } else {
                        if (Config.SHOW_STICK_TYPE.get()) {
                            event.getToolTip().add(1, FormattingUtils.setModLangComponent("message", "handle").withStyle(ChatFormatting.GRAY));
                            event.getToolTip().add(2, Component.literal(" " + ToolUtils.getStickFromName(item)).withStyle(ChatFormatting.DARK_GRAY));
                        }
                    }

                } else if (namespace.equals(ResourceLocation.DEFAULT_NAMESPACE)) {
                    if (Screen.hasShiftDown() && Config.SHOW_MATERIAL_STATS.get()) {
                        event.getToolTip().add(2, ToolUtils.getToolStatDescription("wood", ToolUtils.getBaseMaterialFromVanillaItem(name)));
                        event.getToolTip().add(3, Component.empty());

                    } else {
                        if (Config.SHOW_STICK_TYPE.get()) {
                            event.getToolTip().add(1, FormattingUtils.setModLangComponent("message", "handle").withStyle(ChatFormatting.GRAY));
                            event.getToolTip().add(2, Component.literal(" ").append(FormattingUtils.setModLangComponent("item", "stick_wood")).withStyle(ChatFormatting.DARK_GRAY));
                        }
                    }

                } else if (namespace.equals("bedrockminer")) {
                    if (Config.SHOW_STICK_TYPE.get()) {
                        event.getToolTip().add(1, FormattingUtils.setModLangComponent("message", "handle").withStyle(ChatFormatting.GRAY));
                        event.getToolTip().add(2, Component.literal(" ").append(FormattingUtils.setModLangComponent("item", "stick_diamond")).withStyle(ChatFormatting.DARK_GRAY));
                    }

                } else {
                    if (Config.SHOW_STICK_TYPE.get()) {
                        event.getToolTip().add(1, FormattingUtils.setModLangComponent("message", "handle").withStyle(ChatFormatting.GRAY));
                        event.getToolTip().add(2, Component.literal(" ").append(FormattingUtils.setModLangComponent("item", "stick_wood")).withStyle(ChatFormatting.DARK_GRAY));
                    }
                }
            }
    }



    @SubscribeEvent
    public static void onGatherComponents(RenderTooltipEvent.GatherComponents event) {
        ItemStack stack = event.getItemStack();

        // dieselben Bedingungen wie in deinem ItemTooltipEvent
        Item item = stack.getItem();
        String namespace = BuiltInRegistries.ITEM.getKey(item).getNamespace();
        String name      = BuiltInRegistries.ITEM.getKey(item).getPath();

        if (Config.SHOW_STICK_TYPE.get() && item.components().has(DataComponents.TOOL) && !namespace.equals("tconstruct")
                && ToolUtils.isToolType(name)) {

            if (stack.getItem() instanceof CustomAxeItem tool) {
                var data = stack.get(ModComponents.SOCKET_COMPONENT.get());
                var sockets = data.sockets();
                int maxSockets = tool.getSocketCount();

                TooltipComponent socketComp = new SocketTooltipComponent(maxSockets, sockets);

                // Finde den Index des ersten vorhandenen TooltipComponent-Eintrags
                var elements = event.getTooltipElements(); // List<Either<FormattedCharSequence, TooltipComponent>>
                int insertIndex = elements.size();          // default ans Ende
                for (int i = 0; i < elements.size(); i++) {
                    boolean isComponent = elements.get(i).map(left -> false, right -> true);
                    if (isComponent) {
                        insertIndex = i;
                        break;
                    }
                }

                // Füge direkt *vor* den Standard-Komponenten ein
                elements.add(insertIndex, Either.right(socketComp));
            }
        }
    }


    @SubscribeEvent
    public static void onRightClick(PlayerInteractEvent.RightClickItem evt) {
        ItemStack tool = evt.getItemStack();      // das Tool im Haupt-Handslot
        ItemStack held = new ItemStack(Items.DIAMOND); // Item, das eingesetzt werden soll

        // Prüfe, ob es dein Tool ist und ob noch Platz ist:
        if (tool.getItem() instanceof CustomAxeItem) {
            tool.update(
                    ModComponents.SOCKET_COMPONENT.get(),
                    ModComponents.SocketData.EMPTY,
                    old -> {
                        if (old.sockets().size() < ((CustomAxeItem)tool.getItem()).getSocketCount()) {
                            var list = new ArrayList<>(old.sockets());
                            list.add(held.split(1));
                            return new ModComponents.SocketData(List.copyOf(list));
                        }
                        return old; // kein Platz
                    }
            );
            evt.setCancellationResult(InteractionResult.SUCCESS);
            evt.setCanceled(true);
        }
    }


    /**
     * @author XxRexRaptorxX (RexRaptor)
     *
     * When entering a new MC installation for the first time, a message appears informing about the risks of mod reposts.
     * Then generates a marker file in the configs folder with more details. Supports implementation in multiple mods.
     *
     * You are welcome to implement this method in your own mods!
     */
    @SubscribeEvent
    public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) return;

        Path configDir = FMLPaths.CONFIGDIR.get();
        Path marker   = configDir.resolve("#STOP_MOD_REPOSTS.txt");

        try {
            if (Files.notExists(marker)) {
                String fileContent = """
                        Sites like 9minecraft.net, mc-mod.net, and many others, are known for reuploading mod files without permission from the authors. These sites will also contain a bunch of ads, to try to make money from mods they did not create.
                        
                        These sites will use various methods to appear higher in Google when you search for the mod name, so a lot of people will download mods from them instead of the proper place. If you were linked to this site, you're one of these people.
                        
                        FOR YOU, AS A PLAYER, THIS CAN MEAN ANY OF THE FOLLOWING:
                        > Getting versions of the mods advertised for the wrong Minecraft versions, which will 100% crash when you load them.
                        > Getting old, and broken, versions of the mods, possibly causing problems in your game.
                        > Getting modified versions of the mods, which may contain malware and viruses.
                        > Having your information stolen from malicious ads in the sites.
                        > Taking money and views away from the official authors, which may cause them to stop making new mods.

                        WHAT DO I DO NOW?
                        The most important thing to do now is to make sure you stop visiting these sites, and get the mods from official sources. We also recommend you do the following:
                        
                        > Delete all the mods you've downloaded from these sites.
                        > Install the StopModReposts plugin, which makes sure you never visit them again.
                        > Run a virus/malware scan. We recommend MalwareBytes.
                        > Check out the #StopModReposts campaign, that tries to put an end to these sites. (https://stopmodreposts.org/)
                        > Spread the word. If you have any friends that use these sites, inform them to keep them safe.
                        
                        WHERE DO I GET MODS NOW?
                        Here's a bunch of links to places where you can download official versions of mods, hosted by their real authors:
                        
                        > CurseForge, where most modders host their mods. If it exists, it's probably there.
                        > Modrinth, a new hosting platform for mods that's also legit and more popular by the day.
                        > OptiFine.net, the official OptiFine site.
                        > Neoforged.net, which you need for any other Neoforge mods.
                        > FabricMC.net, which you need for any other Fabric mods.
                        > MinecraftForge Files, which you need for any other Forge mods.
                        
                        This doesn't mean other sites aren't legit. In general, the first place to look for a mod is CurseForge and Modrinth, so look there first.
                        
                        FAQ
                        Q: What if I've never had problems before?
                        > Just because you've never had problems with these sites before doesn't mean they're good. You should still avoid them for all the reasons listed above.
                        
                        Q: Is there a list of these sites I can check out?
                        > Yes, however, due to these showing up all the time, it's possible to be incomplete. (https://github.com/StopModReposts/Illegal-Mod-Sites/blob/master/SITES.md)
                        
                        Q: Why can't you just take these sites down?
                        > Unfortunately, these sites are often hosted in countries like Russia or Vietnam, where doing so isn't as feasible.
                        
                        Q: What if it says "Official Download" on the sites?
                        > Sometimes they'll do that to trick you. If you're uncertain, you should verify with the StopModReposts list linked above.
                        
                        
                        Credits: XxRexRaptorxX, Vazkii, StopModReposts campaign
                    """;

                Files.writeString(marker, fileContent, StandardCharsets.UTF_8);
                String launcher = FMLLoader.getLauncherInfo().toLowerCase();

                if (!launcher.contains("curseforge") || !launcher.contains("modrinth") || !launcher.contains("prism")) {
                    AdvancedTools.LOGGER.info("Stop-mod-reposts info message is generated. Don't worry, this message should only appear the very first time after installation!");
                    player.sendSystemMessage(Component.literal("Important information about mod reposts:\n").withStyle(ChatFormatting.UNDERLINE).withStyle(ChatFormatting.DARK_RED));
                    player.sendSystemMessage(Component.literal("Sites like 9minecraft.net, mc-mod.net, etc. are known for reuploading mod files without permissions. \nThese sites will also contain a bunch of ads, to try to make money from mods they did not create.\n").withStyle(ChatFormatting.RED));
                    player.sendSystemMessage(Component.literal("For you, this can mean any of the following:").withStyle(ChatFormatting.UNDERLINE).withStyle(ChatFormatting.RED));
                    player.sendSystemMessage(Component.literal("- Modified versions of mods, which may contain malware & viruses").withStyle(ChatFormatting.YELLOW));
                    player.sendSystemMessage(Component.literal("- Having your information stolen from malicious ads").withStyle(ChatFormatting.YELLOW));
                    player.sendSystemMessage(Component.literal("- Old and broken mod versions that can corrupt your world").withStyle(ChatFormatting.YELLOW));
                    player.sendSystemMessage(Component.literal("- Taking money and views away from the real authors, which may cause them to stop making mods").withStyle(ChatFormatting.YELLOW));

                    MutableComponent url = Component.translatable(ChatFormatting.GOLD + "* Click here for more information *")
                            .withStyle(style -> style.withClickEvent(new ClickEvent.OpenUrl(URI.create("https://vazkii.net/repost/"))));
                    player.sendSystemMessage(url);
                }
            }
        } catch (IOException e) {
            AdvancedTools.LOGGER.error(e);
        }
    }

}
