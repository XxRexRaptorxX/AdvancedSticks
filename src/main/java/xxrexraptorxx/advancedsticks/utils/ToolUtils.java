package xxrexraptorxx.advancedsticks.utils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import xxrexraptorxx.advancedsticks.main.References;

public class ToolUtils {

    /** Returns the cleaned name of the handle type from a AS-Tool.
     *
     * @param item AS-Tool
     * @return name
     */
    public static String getStickFromName(Item item) {
        String name = BuiltInRegistries.ITEM.getKey(item).toString();
        int prefix = References.MODID.length() + 1;

        if(name.contains("rod")) {
            return name.substring(prefix, prefix + 1).toUpperCase() +
                    name.substring(prefix + 1, name.indexOf("_"));

        } else if (name.contains("enchanted_stick") || name.contains("advanced_stick")){
            return name.substring(prefix, prefix + 1).toUpperCase() +
                    name.substring(prefix + 1, name.indexOf("_")) + " Stick";
        } else {
            return name.substring(prefix, prefix + 1).toUpperCase() +
                    name.substring(prefix + 1, name.indexOf("_")) + " Rod";
        }
    }

}
