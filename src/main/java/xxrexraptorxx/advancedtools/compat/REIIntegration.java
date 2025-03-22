package xxrexraptorxx.advancedtools.compat;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import me.shedaniel.rei.forge.REIPluginClient;
import me.shedaniel.rei.plugin.client.BuiltinClientPlugin;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import xxrexraptorxx.advancedtools.datagen.ItemModelGen;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

@REIPluginClient
public class REIIntegration implements REIClientPlugin {

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        if (Config.JEI_DESCRIPTION.get()) {
            BuiltinClientPlugin instance = BuiltinClientPlugin.getInstance();

            for (String handle : ModItems.HANDLE_MATERIALS) {
                for (String base : ModItems.BASE_MATERIALS) {
                    for (String tool : ModItems.TOOL_TYPES) {

                        instance.registerInformation(EntryStacks.of(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_" + tool))), Component.empty(), list -> {
                            list.add(ToolUtils.getToolStatDescription(handle, base));
                            return list;
                        });
                    }
                }
            }

            //VANILLA
            for (String base : ModItems.BASE_MATERIALS) {
                String head = base;

                if (base.equals("wood") || base.equals("gold")) {
                    head = base + "en";
                }

                for (String tool : ModItems.TOOL_TYPES) {
                    instance.registerInformation(EntryStacks.of(BuiltInRegistries.ITEM.getValue(ResourceLocation.withDefaultNamespace(head + "_" + tool))), Component.empty(), list -> {
                        list.add(ToolUtils.getToolStatDescription("wood", base));
                        return list;
                    });
                }
            }
        }
    }

}

