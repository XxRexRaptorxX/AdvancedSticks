package xxrexraptorxx.advancedsticks.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.advancedsticks.main.References;
import xxrexraptorxx.advancedsticks.utils.Config;
import xxrexraptorxx.advancedsticks.utils.ToolUtils;

public class CreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, References.MODID) ;

    public static void init(IEventBus bus) { CREATIVE_MODE_TABS.register(bus); }


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register(References.MODID, () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + "_tab"))
            .icon(() -> BuiltInRegistries.ITEM.getValue(getItemLoc( "iron_stick_diamond_pickaxe")).getDefaultInstance())
            .displayItems((params, output) -> {

                    //rods
                    for (String handle : ModItems.HANDLE_MATERIALS) {
                        //AdvancedSticks.LOGGER.info("Register stick in creative tab: " + handle + " " + BuiltInRegistries.ITEM.getValue(getStickLoc(handle)));
                        if (!ToolUtils.isVanillaRod(handle) && Config.STICK_MATERIALS.get().contains(handle))
                            output.accept(BuiltInRegistries.ITEM.getValue(getStickLoc(handle)));
                    }
                    //tools
                    for (String base : ModItems.BASE_MATERIALS) {
                        for (String handle : ModItems.HANDLE_MATERIALS) {
                            //AdvancedSticks.LOGGER.info("Register tools in creative tab: " + handle + " handle + " + base + " head.");
                            if (Config.STICK_MATERIALS.get().contains(handle))
                                output.accept(BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, handle + "_stick_" + base + "_sword")));
                        }
                    }
                    for (String base : ModItems.BASE_MATERIALS) {
                        for (String handle : ModItems.HANDLE_MATERIALS) {
                            //AdvancedSticks.LOGGER.info("Register tools in creative tab: " + handle + " handle + " + base + " head.");

                            if (Config.STICK_MATERIALS.get().contains(handle))
                                output.accept(BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, handle + "_stick_" + base + "_shovel")));
                        }
                    }
                    for (String base : ModItems.BASE_MATERIALS) {
                        for (String handle : ModItems.HANDLE_MATERIALS) {
                            //AdvancedSticks.LOGGER.info("Register tools in creative tab: " + handle + " handle + " + base + " head.");

                            if (Config.STICK_MATERIALS.get().contains(handle))
                                output.accept(BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, handle + "_stick_" + base + "_pickaxe")));
                        }
                    }
                    for (String base : ModItems.BASE_MATERIALS) {
                        for (String handle : ModItems.HANDLE_MATERIALS) {
                            //AdvancedSticks.LOGGER.info("Register tools in creative tab: " + handle + " handle + " + base + " head.");

                            if (Config.STICK_MATERIALS.get().contains(handle))
                                output.accept(BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, handle + "_stick_" + base + "_axe")));
                        }
                    }
                    for (String base : ModItems.BASE_MATERIALS) {
                        for (String handle : ModItems.HANDLE_MATERIALS) {
                            //AdvancedSticks.LOGGER.info("Register tools in creative tab: " + handle + " handle + " + base + " head.");

                            if (Config.STICK_MATERIALS.get().contains(handle))
                                output.accept(BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, handle + "_stick_" + base + "_hoe")));
                        }
                    }

                output.accept(ModItems.IRON_BOW.get());
                output.accept(ModItems.GOLD_BOW.get());
                output.accept(ModItems.DIAMOND_BOW.get());
                output.accept(ModItems.NETHERITE_BOW.get());


            }).build());


    private static ResourceLocation getStickLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, "stick_" + name);
    }

    private static ResourceLocation getItemLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, name);
    }
}
