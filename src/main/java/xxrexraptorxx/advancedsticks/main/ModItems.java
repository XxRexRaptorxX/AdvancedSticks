package xxrexraptorxx.advancedsticks.main;

import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.advancedsticks.items.ItemBasic;

public class ModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.MODID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    public static final RegistryObject<ItemBasic> BONE_STICK = ITEMS.register("stick_bone", ItemBasic::new);
    public static final RegistryObject<ItemBasic> IRON_STICK = ITEMS.register("stick_iron", ItemBasic::new);
    public static final RegistryObject<ItemBasic> GOLD_STICK = ITEMS.register("stick_gold", ItemBasic::new);
    public static final RegistryObject<ItemBasic> EMERALD_STICK = ITEMS.register("stick_emerald", ItemBasic::new);
    public static final RegistryObject<ItemBasic> AMETHYST_STICK = ITEMS.register("stick_amethyst", ItemBasic::new);
    public static final RegistryObject<ItemBasic> DIAMOND_STICK = ITEMS.register("stick_diamond", ItemBasic::new);
    public static final RegistryObject<ItemBasic> NETHERITE_STICK = ITEMS.register("stick_netherite", ItemBasic::new);
    public static final RegistryObject<ItemBasic> ENCHANTED_STICK = ITEMS.register("stick_enchanted", ItemBasic::new);

}