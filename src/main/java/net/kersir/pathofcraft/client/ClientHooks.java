package net.kersir.pathofcraft.client;

import net.kersir.pathofcraft.client.screen.StatsScreen;
import net.minecraft.client.Minecraft;

public class ClientHooks {
    public static void openStatsScreen() {
        Minecraft.getInstance().setScreen(new StatsScreen());
    }
}
