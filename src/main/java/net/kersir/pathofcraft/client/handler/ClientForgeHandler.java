package net.kersir.pathofcraft.client.handler;

import net.kersir.pathofcraft.PathOfCraft;
import net.kersir.pathofcraft.client.KeyBindings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PathOfCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {
    private static final Component OPEN_STATS_GUI_KEY_PRESSED =
            Component.translatable("message." + PathOfCraft.MOD_ID + ".open_stats_gui_key_pressed");
    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event) {
        Minecraft minecraft = Minecraft.getInstance();

        if(KeyBindings.INSTANCE.OpenStatsGuiKey.consumeClick() && minecraft.player != null) {
            minecraft.player.displayClientMessage(OPEN_STATS_GUI_KEY_PRESSED, false);
        }
    }
}
