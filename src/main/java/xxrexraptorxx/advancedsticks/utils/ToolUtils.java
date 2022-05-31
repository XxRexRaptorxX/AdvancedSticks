package xxrexraptorxx.advancedsticks.utils;

import net.minecraft.world.item.Item;
import xxrexraptorxx.advancedsticks.main.References;

public class ToolUtils {

    public static String getStickFromName(Item item) {
        String name = item.getRegistryName().toString();
        Integer prefix = References.MODID.length() + 1;

        if(name.contains("rod")) {
            return name.substring(prefix, prefix + 1).toUpperCase() +
                    name.substring(prefix + 1, name.indexOf("_"));
        } else {
            return name.substring(prefix, prefix + 1).toUpperCase() +
                    name.substring(prefix + 1, name.indexOf("_")) + " Stick";
        }
    }

}
