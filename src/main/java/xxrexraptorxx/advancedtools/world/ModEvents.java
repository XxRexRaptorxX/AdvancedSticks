package xxrexraptorxx.advancedtools.world;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.item.component.DamageResistant;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import xxrexraptorxx.advancedtools.datagen.ItemModelGen;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.Arrays;

@EventBusSubscriber(modid = References.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEvents {

    /**
     *  Makes some materials fire & lava resistant
     */
    @SubscribeEvent
    public static void modifyComponents(ModifyDefaultComponentsEvent event) {
        for (String handle : ModItems.HANDLE_MATERIALS) {
            //rods
            if (ToolUtils.isFireResistant(handle)) {
                if (Config.getDebugMode()) AdvancedTools.LOGGER.info("Generate components of " + handle);

                event.modify(BuiltInRegistries.ITEM.getValue(ItemModelGen.getStickLoc(handle)), builder ->
                        builder.set(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_FIRE)));
            }

            //tools
            for (String head : ModItems.TOOL_HEAD_MATERIALS) {
                if (ToolUtils.isFireResistant(handle) || ToolUtils.isFireResistant(head)) {
                    for (String tool : ModItems.TOOL_TYPES) {
                        if(!(Arrays.asList(ModItems.VANILLA_HEAD_MATERIALS).contains(head) && handle.equals("wood"))) {
                            if (Config.getDebugMode()) AdvancedTools.LOGGER.info("Generate components of " + tool + " with " + head + " head and " + handle + " handle");

                            event.modify(BuiltInRegistries.ITEM.getValue(ModItems.getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_" + tool)), builder ->
                                    builder.set(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_FIRE)));
                        }
                    }
                }
            }
        }
    }

}
