package xxrexraptorxx.advancedtools.compat;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import me.shedaniel.rei.forge.REIPluginClient;
import me.shedaniel.rei.plugin.client.BuiltinClientPlugin;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import xxrexraptorxx.advancedtools.datagen.ItemModelGen;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

@REIPluginClient
public class REIIntegration implements REIClientPlugin {

    @Override
    public void registerDisplays(DisplayRegistry registry) {

        if (Config.JEI_DESCRIPTION.get()) {
            for (String handle : ModItems.HANDLE_MATERIALS) {
                for (String base : ModItems.BASE_MATERIALS) {

                    BuiltinClientPlugin.getInstance().registerInformation(EntryStacks.of(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_sword"))), Component.empty(), list -> {
                        list.add(ToolUtils.getItemDescription(handle, base));
                        return list;
                    });
                    BuiltinClientPlugin.getInstance().registerInformation(EntryStacks.of(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_pickaxe"))), Component.empty(), list -> {
                        list.add(ToolUtils.getItemDescription(handle, base));
                        return list;
                    });
                    BuiltinClientPlugin.getInstance().registerInformation(EntryStacks.of(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_axe"))), Component.empty(), list -> {
                        list.add(ToolUtils.getItemDescription(handle, base));
                        return list;
                    });
                    BuiltinClientPlugin.getInstance().registerInformation(EntryStacks.of(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_shovel"))), Component.empty(), list -> {
                        list.add(ToolUtils.getItemDescription(handle, base));
                        return list;
                    });
                    BuiltinClientPlugin.getInstance().registerInformation(EntryStacks.of(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_hoe"))), Component.empty(), list -> {
                        list.add(ToolUtils.getItemDescription(handle, base));
                        return list;
                    });
                }
            }
        }
    }

}

