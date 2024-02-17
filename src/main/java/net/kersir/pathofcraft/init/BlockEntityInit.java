package net.kersir.pathofcraft.init;

import net.kersir.pathofcraft.PathOfCraft;
import net.kersir.pathofcraft.block.ModBlocks;
import net.kersir.pathofcraft.blockentity.MapDeviceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PathOfCraft.MOD_ID);

    public static final RegistryObject<BlockEntityType<MapDeviceBlockEntity>> MAP_DEVICE_BLOCK_ENTITY =
            BLOCK_ENTITES.register("map_device_block_entity",
                    () -> BlockEntityType.Builder.of(MapDeviceBlockEntity::new, ModBlocks.MAP_DEVICE.get())
                            .build(null));

}
