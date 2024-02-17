package net.kersir.pathofcraft.client.screen;

import net.kersir.pathofcraft.PathOfCraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class StatsScreen extends Screen {
    private static final Component TITLE =
            Component.translatable("gui." + PathOfCraft.MOD_ID + ".stats_screen");
    private static final Component STRENGTHNUM =
            Component.translatable("gui." + PathOfCraft.MOD_ID + ".stats_screen_srtnum");
    private static final Component DEXTERITYNUM =
            Component.translatable("gui." + PathOfCraft.MOD_ID + ".stats_screen_dexnum");
    private static final Component INTELLIGENCENUM =
            Component.translatable("gui." + PathOfCraft.MOD_ID + ".stats_screen_intnum");

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(PathOfCraft.MOD_ID, "textures/gui/stats_screen.png");
    private final int imageWidth, imageHeight;
    private int leftPos, topPos;
    public StatsScreen() {
        super(TITLE);

        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    @Override
    protected void init() {
        super.init();

        this.leftPos = (this.width - this.imageWidth) / 2;
        this.topPos = (this.height - this.imageHeight) / 2;
    }

    @Override
    public void render(@NotNull GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {
        renderBackground(pGuiGraphics);
        pGuiGraphics.blit(
                TEXTURE,
                this.leftPos,
                this.topPos,
                0,
                0,
                this.imageWidth,
                this.imageHeight);
        super.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
        pGuiGraphics.drawString(
                this.font,
                TITLE,
                this.leftPos + 10,
                this.topPos + 10,
                0x404040,
                false);

        pGuiGraphics.drawString(
                this.font,
                STRENGTHNUM,
                this.leftPos + 10,
                this.topPos + 20,
                0xAA0000,
                false);
            pGuiGraphics.drawString(
                    this.font,
                    "%d",
                    this.leftPos + 100,
                    this.topPos + 20,
                    0x404040,
                    false);
        pGuiGraphics.drawString(
                this.font,
                DEXTERITYNUM,
                this.leftPos + 10,
                this.topPos + 30,
                0x00AA00,
                false);
            pGuiGraphics.drawString(
                    this.font,
                    "%d",
                    this.leftPos + 100,
                    this.topPos + 30,
                    0x404040,
                    false);
        pGuiGraphics.drawString(
                this.font,
                INTELLIGENCENUM,
                this.leftPos + 10,
                this.topPos + 40,
                0x0000AA,
                false);
            pGuiGraphics.drawString(
                    this.font,
                    "%d",
                    this.leftPos + 100,
                    this.topPos + 40,
                    0x404040,
                    false);

    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
