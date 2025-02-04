package com.obscuria.aquamirae.client.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.obscuria.aquamirae.AquamiraeMod;
import com.obscuria.obscureapi.client.animations.*;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class ModelAnglerfish<T extends Entity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(AquamiraeMod.MODID, "anglerfish"), "main");
	public final ModelPart main, head, headTop, headBottom, body, tail1, tail2, tail3, tail4, tail5, tail6, leftFin, rightFin, lamp1, lamp2, lamp3, lamp4, lamp5;

	public ModelAnglerfish(ModelPart root) {
		this.main = root.getChild("main");
		this.head = main.getChild("head");
		this.body = main.getChild("body");
		this.headTop = head.getChild("headTop");
		this.headBottom = head.getChild("headBottom");
		this.leftFin = body.getChild("leftFin");
		this.rightFin = body.getChild("rightFin");
		this.tail1 = body.getChild("tail1");
		this.tail2 = tail1.getChild("tail2");
		this.tail3 = tail2.getChild("tail3");
		this.tail4 = tail3.getChild("tail4");
		this.tail5 = tail4.getChild("tail5");
		this.tail6 = tail5.getChild("tail6");
		this.lamp1 = headTop.getChild("lamp1");
		this.lamp2 = lamp1.getChild("lamp2");
		this.lamp3 = lamp2.getChild("lamp3");
		this.lamp4 = lamp3.getChild("lamp4");
		this.lamp5 = lamp4.getChild("lamp5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head = main.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition headTop = head.addOrReplaceChild("headTop", CubeListBuilder.create().texOffs(50, 45).addBox(-7.0F, -16.0F, 0.0F, 14.0F, 16.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(59, 10).addBox(1.0F, -17.0F, 2.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(40, 0).addBox(-6.0F, -17.0F, 2.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 55).addBox(-7.0F, -16.0F, -8.0F, 14.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -5.0F));

		PartDefinition lamp1 = headTop.addOrReplaceChild("lamp1", CubeListBuilder.create().texOffs(107, 0).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.0F, 9.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition lamp2 = lamp1.addOrReplaceChild("lamp2", CubeListBuilder.create().texOffs(107, 5).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition lamp3 = lamp2.addOrReplaceChild("lamp3", CubeListBuilder.create().texOffs(107, 10).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition lamp4 = lamp3.addOrReplaceChild("lamp4", CubeListBuilder.create().texOffs(107, 15).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.9163F, 0.0F, 0.0F));

		PartDefinition lamp5 = lamp4.addOrReplaceChild("lamp5", CubeListBuilder.create().texOffs(104, 20).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition headBottom = head.addOrReplaceChild("headBottom", CubeListBuilder.create().texOffs(44, 16).addBox(-7.0F, -2.0F, -14.0F, 14.0F, 3.0F, 16.0F, new CubeDeformation(0.11F))
				.texOffs(0, 32).addBox(-7.0F, -9.0F, -14.0F, 14.0F, 7.0F, 16.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 2.0F, -5.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -8.0F, -11.0F, 12.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(44, 55).addBox(0.0F, -18.0F, -11.0F, 0.0F, 10.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(44, 19).addBox(0.0F, 8.0F, -11.0F, 0.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail1 = body.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(68, 73).addBox(-4.0F, -7.0F, 0.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(76, 27).addBox(0.0F, -17.0F, 0.0F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(0.0F, 7.0F, 0.0F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(12, 79).addBox(-2.0F, -6.0F, 0.0F, 4.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(52, 0).addBox(0.0F, -15.0F, 0.0F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(40, 0).addBox(0.0F, 6.0F, 0.0F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 8.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(0.0F, -12.0F, 0.0F, 0.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(56, 75).addBox(0.0F, -8.0F, 0.0F, 0.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(44, 75).addBox(0.0F, -8.0F, 0.0F, 0.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(32, 73).addBox(0.0F, -8.0F, 0.0F, 0.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition leftFin = body.addOrReplaceChild("leftFin", CubeListBuilder.create().texOffs(0, 103).addBox(0.0F, -2.0F, -0.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 103).addBox(0.5F, -6.0F, -0.5F, 0.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.0F, -4.5F, 0.0F, 0.5672F, 0.0F));

		PartDefinition rightFin = body.addOrReplaceChild("rightFin", CubeListBuilder.create().texOffs(0, 103).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 103).addBox(-0.5F, -6.0F, -0.5F, 0.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, -4.5F, 0.0F, -0.6981F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
							   float blue, float alpha) {
		poseStack.pushPose();
		poseStack.scale(1.5F, 1.5F, 1.5F);
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		poseStack.popPose();
	}

	public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		final float idle = HekateLib.mod.idle(limbSwingAmount, 3F);
		final float move = HekateLib.mod.move(limbSwingAmount, 3F);
		final float speed1 = 0.1F;
		final float speed2 = 0.6F;

		HekateLib.render.tick(entity);
		HekateLib.render.prepare(main, head, headTop, headBottom, body, tail1, tail2, tail3, tail4, tail5, tail6, leftFin, rightFin, lamp1, lamp2, lamp3, lamp4, lamp5);

		HekateLib.i(main, 1F, -15F, 0, 0, 0, 0, speed1, 0F, ageInTicks, idle);
		HekateLib.i(head, -1F, -35F, 0, 0, 0, 0, speed1, 0F, ageInTicks, idle);
		HekateLib.i(body, 0, 0, 5F, 0, 0, 0, speed1, 0F, ageInTicks, idle);
		HekateLib.i(tail1, 0, 0, 7F, 0, 0, 0, speed1, -0.05F, ageInTicks, idle);
		HekateLib.i(tail2, 0, 0, 9F, 0, 0, 0, speed1, -0.1F, ageInTicks, idle);
		HekateLib.i(tail3, 0, 0, 11F, 0, 0, 0, speed1, -0.15F, ageInTicks, idle);
		HekateLib.i(tail4, 0, 0, 13F, 0, 0, 0, speed1, -0.2F, ageInTicks, idle);
		HekateLib.i(tail5, 0, 0, 15F, 0, 0, 0, speed1, -0.25F, ageInTicks, idle);
		HekateLib.i(tail6, 0, 0, 15F, 0, 0, 0, speed1, -0.3F, ageInTicks, idle);
		HekateLib.i(leftFin, 0, 0, 15F, -40F, 0, -30F, speed1, -0.1F, ageInTicks, idle);
		HekateLib.i(rightFin, 0, 0, -15F, 40F, 0, 30F, speed1, -0.1F, ageInTicks, idle);
		HekateLib.i(lamp1, 2F, -5F, 0, 0, 0, 0, speed1, 0F, ageInTicks, idle);
		HekateLib.i(lamp2, 4F, -10F, 0, 0, 0, 0, speed1, -0.05F, ageInTicks, idle);
		HekateLib.i(lamp3, 6F, -30F, 0, 0, 0, 0, speed1, -0.1F, ageInTicks, idle);
		HekateLib.i(lamp4, 8F, -50F, 0, 0, 0, 0, speed1, -0.15F, ageInTicks, idle);
		HekateLib.i(lamp5, 10F, -30F, 0, 0, 0, 0, speed1, -0.2F, ageInTicks, idle);

		HekateLib.m(main, 1F, -15F, 0, 0, 0, 0, speed2, 0F, limbSwing, move);
		HekateLib.m(head, -1F, -35F, -10F, 0, 0, 0, speed2, 0F, limbSwing, move);
		HekateLib.m(body, 0, 0, 5F, 0, 0, 0, speed2, 0F, limbSwing, move);
		HekateLib.m(tail1, 0, 0, 10F, 0, 0, 0, speed2, -0.05F, limbSwing, move);
		HekateLib.m(tail2, 0, 0, 10F, 0, 0, 0, speed2, -0.1F, limbSwing, move);
		HekateLib.m(tail3, 0, 0, 15F, 0, 0, 0, speed2, -0.15F, limbSwing, move);
		HekateLib.m(tail4, 0, 0, 15F, 0, 0, 0, speed2, -0.2F, limbSwing, move);
		HekateLib.m(tail5, 0, 0, 20F, 0, 0, 0, speed2, -0.25F, limbSwing, move);
		HekateLib.m(tail6, 0, 0, 20F, 0, 0, 0, speed2, -0.3F, limbSwing, move);
		HekateLib.m(leftFin, 0, 0, 15F, -40F, 0, -30F, speed2, -0.1F, limbSwing, move);
		HekateLib.m(rightFin, 0, 0, -15F, 40F, 0, 30F, speed2, -0.1F, limbSwing, move);
		HekateLib.m(lamp1, 2F, -5F, 0, 0, 0, 0, speed2, 0F, ageInTicks, move);
		HekateLib.m(lamp2, 4F, -10F, 0, 0, 0, 0, speed2, -0.05F, ageInTicks, move);
		HekateLib.m(lamp3, 6F, -30F, 0, 0, 0, 0, speed2, -0.1F, ageInTicks, move);
		HekateLib.m(lamp4, 8F, -50F, 0, 0, 0, 0, speed2, -0.15F, ageInTicks, move);
		HekateLib.m(lamp5, 10F, -30F, 0, 0, 0, 0, speed2, -0.2F, ageInTicks, move);

		if (entity instanceof IHekateProvider iHekateProvider)
			this.main.y = 5F + 5F * iHekateProvider.getHekateProvider().getModifier("onGround1");
		HekateLib.render.animation(entity, "onGround", ageInTicks,
				new KeyFrame(20, 0, 5F, 5F,
						new AnimatedPart(main, 0, 0, 90),
						new AnimatedPart(body, 0, 0, 2F, 2F, 0, 0, speed2, 0F),
						new AnimatedPart(tail1, 0, 0, 3F, 3F, 0, 0, speed2, -0.05F),
						new AnimatedPart(tail2, 0, 0, 4F, 4F, 0, 0, speed2, -0.1F),
						new AnimatedPart(tail3, 0, 0, 5F, 5F, 0, 0, speed2, -0.15F),
						new AnimatedPart(tail4, 0, 0, 6F, 6F, 0, 0, speed2, -0.2F),
						new AnimatedPart(tail5, 0, 0, 7F, 7F, 0, 0, speed2, -0.25F),
						new AnimatedPart(tail6, 0, 0, 8F, 8F, 0, 0, speed2, -0.3F)));
		HekateLib.render.animation(entity, "attack", ageInTicks,
				new KeyFrame(30, 10, 5F, 18F,
						new AnimatedPart(headTop, 1F, 15F, 0, 0, 0, 0, speed2 * 4, 0F),
						new AnimatedPart(headBottom, -1F, -15F, 0, 0, 0, 0, speed2 * 4, 0F),
						new AnimatedPart(body, 0, 0, 10F, 0, 0, 0, speed2, 0F),
						new AnimatedPart(tail1, 0, 0, 15F, 0, 0, 0, speed2, -0.05F),
						new AnimatedPart(tail2, 0, 0, 20F, 0, 0, 0, speed2, -0.1F),
						new AnimatedPart(tail3, 0, 0, 25F, 0, 0, 0, speed2, -0.15F),
						new AnimatedPart(tail4, 0, 0, 30F, 0, 0, 0, speed2, -0.2F),
						new AnimatedPart(tail5, 0, 0, 35F, 0, 0, 0, speed2, -0.25F),
						new AnimatedPart(tail6, 0, 0, 40F, 0, 0, 0, speed2, -0.3F)),
				new KeyFrame(10, 0, 18F, 4F,
						new AnimatedPart(headTop, -25F, 0, 0),
						new AnimatedPart(headBottom, 25F, 0, 0),
						new AnimatedPart(body, 0, 0, 5F, 0, 0, 0, speed2, 0F),
						new AnimatedPart(tail1, 0, 0, 10F, 0, 0, 0, speed2, -0.05F),
						new AnimatedPart(tail2, 0, 0, 15F, 0, 0, 0, speed2, -0.1F),
						new AnimatedPart(tail3, 0, 0, 20F, 0, 0, 0, speed2, -0.15F),
						new AnimatedPart(tail4, 0, 0, 25F, 0, 0, 0, speed2, -0.2F),
						new AnimatedPart(tail5, 0, 0, 25F, 0, 0, 0, speed2, -0.25F),
						new AnimatedPart(tail6, 0, 0, 25F, 0, 0, 0, speed2, -0.3F)));
		final float headMod = entity instanceof IHekateProvider provider ? 1F - provider.getHekateProvider().getModifier("onGround1") : 1F;
		this.main.xRot += HekateLib.render.head(headPitch, headMod);
		this.main.yRot += HekateLib.render.head(netHeadYaw, headMod);
		this.main.xRot += HekateLib.render.head(netHeadYaw, 1F - headMod);
	}
}
