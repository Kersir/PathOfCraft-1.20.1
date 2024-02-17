package net.kersir.pathofcraft.item;

import net.kersir.pathofcraft.PathOfCraft;
import net.kersir.pathofcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PathOfCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PATHOFCRAFT_TAB = CREATIVE_MODE_TABS.register("pathofcraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MAP_T1.get()))
                    .title(Component.translatable("creativetab.pathofcraft_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MAP_T1.get());
                        output.accept(ModItems.Exalted_Orb.get());

                        output.accept(ModBlocks.MAP_DEVICE.get());
                        output.accept(ModBlocks.TELE_BLOCK_T1.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
