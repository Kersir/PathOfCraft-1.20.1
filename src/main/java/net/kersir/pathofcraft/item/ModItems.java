package net.kersir.pathofcraft.item;

import net.kersir.pathofcraft.PathOfCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PathOfCraft.MOD_ID);

    public static final RegistryObject<Item> MAP_T1 = ITEMS.register("map_t1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAP_DEVICE = ITEMS.register("map_device",
            () -> new Item(new Item.Properties()));

    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
