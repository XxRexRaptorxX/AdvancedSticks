package xxrexraptorxx.advancedtools.compat;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import me.shedaniel.rei.forge.REIPluginClient;
import me.shedaniel.rei.plugin.client.BuiltinClientPlugin;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.magmacore.content.ItemHelper;

@REIPluginClient
public class REIIntegration implements REIClientPlugin {

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        if (Config.getJEIDescription()) {
            BuiltinClientPlugin instance = BuiltinClientPlugin.getInstance();

            for (String handle : ModItems.HANDLE_MATERIALS) {
                for (String base : ModItems.TOOL_HEAD_MATERIALS) {
                    for (String tool : ModItems.TOOL_TYPES) {

                        instance.registerInformation(
                                EntryStacks.of(BuiltInRegistries.ITEM.getValue(ItemHelper.getLocation(References.MODID, handle + FormattingUtils.AT_INFIX + base + "_" + tool))),
                                Component.empty(), list -> {
                                    list.add(ToolUtils.getToolStatDescription(handle, base));
                                    return list;
                                });
                    }
                }
            }

            // VANILLA
            for (String base : ModItems.TOOL_HEAD_MATERIALS) {
                for (String tool : ModItems.TOOL_TYPES) {
                    instance.registerInformation(EntryStacks.of(BuiltInRegistries.ITEM.getValue(ResourceLocation.withDefaultNamespace(base + "_" + tool))), Component.empty(),
                            list -> {
                                list.add(ToolUtils.getToolStatDescription("wood", base));
                                return list;
                            });
                }
            }
        }
    }

}
