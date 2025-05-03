package xxrexraptorxx.advancedtools.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

public class CreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, References.MODID) ;

    public static void init(IEventBus bus) { CREATIVE_MODE_TABS.register(bus); }


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register(References.MODID, () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + "_tab"))
            .icon(() -> BuiltInRegistries.ITEM.getValue(getItemLoc( "iron_stick_diamond_pickaxe")).getDefaultInstance())
            .displayItems((params, output) -> {

                for (String handle : ModItems.HANDLE_MATERIALS) {
                    if (Config.DEBUG_MODE.get()) AdvancedTools.LOGGER.info("Register rod in creative tab: " + handle + " " + BuiltInRegistries.ITEM.getValue(getStickLoc(handle)));

                    if (!ToolUtils.isRod(handle) && ToolUtils.isValidRodForCreative(handle)) {
                        output.accept(BuiltInRegistries.ITEM.getValue(getStickLoc(handle)));
                    }

                    for (String head : ModItems.TOOL_HEAD_MATERIALS) {
                        if (Config.DEBUG_MODE.get()) AdvancedTools.LOGGER.info("Register tools in creative tab: " + handle + " handle + " + head + " head.");

                        if (ToolUtils.isValidForCreative(head, handle)) {
                            for (String tool : ModItems.TOOL_TYPES) {
                                output.accept(BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_" + head + "_" + tool)));
                            }
                        }
                    }
                }

                //bows
                output.accept(ModItems.IRON_BOW.get());
                output.accept(ModItems.GOLD_BOW.get());
                output.accept(ModItems.DIAMOND_BOW.get());
                output.accept(ModItems.NETHERITE_BOW.get());

            }).build()
    );


    private static ResourceLocation getStickLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, "stick_" + name);
    }


    private static ResourceLocation getItemLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, name);
    }
}
