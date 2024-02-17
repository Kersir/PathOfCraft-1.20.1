package net.kersir.pathofcraft.block;

import net.kersir.pathofcraft.PathOfCraft;
import net.kersir.pathofcraft.block.entity.MapDeviceBlock;
import net.kersir.pathofcraft.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PathOfCraft.MOD_ID);

    public static final RegistryObject<MapDeviceBlock> MAP_DEVICE = registerBlock("map_device",
            () -> new MapDeviceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.AMETHYST)
                    .strength(5f,20f)
                    .requiresCorrectToolForDrops()
                    .lightLevel(state -> 10)
            ));



    public static final RegistryObject<Block> TELE_BLOCK_T1 = registerBlock("tele_block_t1",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)
                    .sound(SoundType.AMETHYST)
                    .lightLevel(state -> 10)
                    .noCollission()
            ));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}