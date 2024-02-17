package net.kersir.pathofcraft.blockentity;

import net.kersir.pathofcraft.PathOfCraft;
import net.kersir.pathofcraft.init.BlockEntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class MapDeviceBlockEntity extends BlockEntity {
    private int counter;

    public MapDeviceBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(BlockEntityInit.MAP_DEVICE_BLOCK_ENTITY.get(), pPos, pBlockState);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        
        //Save pTag (i.e. nbt) to prevent other mods to override it
        CompoundTag PathOfCraftData = pTag.getCompound(PathOfCraft.MOD_ID);
        this.counter = PathOfCraftData.getInt("Counter");
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag pTag) {
        super.saveAdditional(pTag);

        var PathOfCraftData = new CompoundTag();
        PathOfCraftData.putInt("Counter", this.counter);
        pTag.put(PathOfCraft.MOD_ID, PathOfCraftData);
    }

    public int incrementCounter() {
        this.counter++;
        setChanged();
        return this.counter;
    }

    public int getCounter() {
        return this.counter;
    }
}

