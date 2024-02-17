package net.kersir.pathofcraft.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.kersir.pathofcraft.PathOfCraft;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;

public final class KeyBindings {
    public static final KeyBindings INSTANCE = new KeyBindings();

    private KeyBindings() {}

    public static final String CATEGORY = "key.categories." + PathOfCraft.MOD_ID;

    public final KeyMapping OpenStatsGuiKey = new KeyMapping(
            "key." + PathOfCraft.MOD_ID + ".open_stats_gui_key",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_NUMPAD9, -1),
            CATEGORY
    );
}
