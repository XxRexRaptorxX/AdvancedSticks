package xxrexraptorxx.advancedsticks.main;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.advancedsticks.utils.Config;
import xxrexraptorxx.advancedsticks.utils.ModItemProperties;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/advanced-sticks
 **/
@Mod(References.MODID)
public class AdvancedSticks {

    public static final Logger LOGGER = LogManager.getLogger();
    private static final ResourceLocation CREATIVE_TAB = new ResourceLocation(References.MODID, "tab");


    public AdvancedSticks() {
        Mod.EventBusSubscriber.Bus.MOD.bus().get().register(AdvancedSticks.class);
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Config.init();
        ModItems.init();

        eventBus.addListener(this::clientSetup);
    }


    private void clientSetup(final FMLClientSetupEvent event) {
        ModItemProperties.addItemProperties();
    }


    //Creative Tab
    @SubscribeEvent
    public static void registerTabs(final CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(CREATIVE_TAB, (cf) -> cf.icon(() -> new ItemStack(ModItems.IRON_STICK_DIAMOND_PICKAXE.get()))
                .title(Component.translatable("itemGroup." + References.MODID + "_tab")).displayItems((flagSet, output, ifSth) -> {
                    output.accept(ModItems..get());

                })
        );
    }
}