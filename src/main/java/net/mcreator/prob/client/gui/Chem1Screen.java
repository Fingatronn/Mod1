package net.mcreator.prob.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.prob.world.inventory.Chem1Menu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Chem1Screen extends AbstractContainerScreen<Chem1Menu> {
	private final static HashMap<String, Object> guistate = Chem1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Chem1Screen(Chem1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 305;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("prob:textures/screens/chem_1.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("prob:textures/screens/da.png"));
		this.blit(ms, this.leftPos + 125, this.topPos + 34, 0, 0, 54, 10, 54, 10);

		RenderSystem.setShaderTexture(0, new ResourceLocation("prob:textures/screens/da2.png"));
		this.blit(ms, this.leftPos + 143, this.topPos + 7, 0, 0, 54, 10, 54, 10);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.prob.chem_1.label_chemical_reactor"), 170, 7, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.prob.chem_1.label_bnbtintegerprocess"), 8, 7, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.prob.chem_1.label_energy"), 8, 25, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.prob.chem_1.label_fluidlevel"), 8, 43, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.prob.chem_1.label_bnbttextfluidtype"), 8, 61, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
