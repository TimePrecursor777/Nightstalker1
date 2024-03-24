package net.timeprecursor.a_1_20_2.entity.client;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.timeprecursor.a_1_20_2.entity.animations.ModAnimationDefs;
import net.timeprecursor.a_1_20_2.entity.custom.NightstalkerEntity;

public class nightstalkermodel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart DINO;
	private final ModelPart head;
	public nightstalkermodel(ModelPart root) {
		this.DINO = root.getChild("DINO");
		this.head = DINO.getChild("bODY").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		// this next line may not work -
		PartDefinition DINO = partdefinition.addOrReplaceChild("DINO", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bODY = DINO.addOrReplaceChild("bODY", CubeListBuilder.create(), PartPose.offset(0.5F, -1.049F, -1.3F));

		PartDefinition cube_r1 = bODY.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 95).addBox(-2.0F, -2.5F, -10.75F, 4.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -15.6736F, 53.7611F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bODY.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 0).addBox(-3.0F, -4.3F, -17.75F, 6.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -15.8291F, 47.6959F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bODY.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(42, 51).addBox(-4.0F, -5.6F, -26.5F, 8.0F, 10.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -16.8125F, 40.4879F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bODY.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 79).addBox(-4.0F, -10.5F, -6.0F, 8.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -33.7652F, -22.7802F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bODY.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 69).addBox(-5.0F, -8.0F, -6.0F, 10.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -30.694F, -13.2504F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bODY.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -8.0F, -19.0F, 12.0F, 17.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(0, 37).addBox(-6.0F, -7.0F, -9.0F, 12.0F, 14.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -25.0F, 8.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head = bODY.addOrReplaceChild("head", CubeListBuilder.create().texOffs(45, 18).addBox(-3.0F, -5.5F, -9.5F, 6.0F, 11.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -42.7652F, -28.2802F));

		PartDefinition bone2 = DINO.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(44, 6).addBox(-1.1352F, 23.0F, -6.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.1648F, -25.0F, 5.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 4).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2273F, 22.8571F, -5.2644F, 0.1745F, -0.0873F, -0.0873F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 16).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2549F, 23.5556F, -5.0311F, -0.8727F, -0.0873F, -0.0873F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 0).addBox(-1.0F, -1.1F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0969F, 23.367F, -3.3686F, 0.0F, -0.0873F, -0.0873F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 8).addBox(-1.0F, -1.3F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9825F, 23.1833F, -2.2491F, 0.4363F, -0.0873F, -0.0873F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(70, 88).addBox(-2.5F, -2.2F, -6.9F, 5.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3726F, 2.6212F, -2.1665F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 48).addBox(-2.5F, -5.8F, -7.4F, 5.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3726F, 3.6168F, -1.551F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(95, 23).addBox(-2.5F, -3.4F, -5.6F, 5.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3726F, 8.0756F, -0.4755F, 2.618F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(44, 0).addBox(-2.5F, -1.5F, -6.0F, 5.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3726F, 15.4902F, 1.2634F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(66, 6).addBox(-1.1F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3274F, 18.4308F, 0.454F, 1.383F, -0.1157F, -0.096F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(44, 0).addBox(-1.25F, -1.0F, -2.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8648F, 20.9085F, -0.3281F, 0.8727F, -0.0873F, -0.0873F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -1.4F, -0.8F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1352F, 24.0F, -2.4F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0537F, 0.4472F, -0.5713F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1476F, 23.0378F, -3.6235F, 0.8727F, 0.4363F, -0.0436F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 69).addBox(-1.0229F, -0.0378F, -2.3589F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1476F, 23.0378F, -3.6235F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0962F, -1.9837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1352F, 23.9755F, -5.55F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 3).addBox(-0.5229F, -1.0386F, -3.7592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1476F, 23.0378F, -3.6235F, 0.5236F, 0.3927F, 0.0F));

		PartDefinition bone = DINO.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(66, 0).addBox(-0.8648F, 23.0F, -5.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(8.1648F, -25.0F, 4.0F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(10, 12).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2273F, 22.8571F, -4.2644F, 0.1745F, 0.0873F, 0.0873F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2549F, 23.5556F, -4.0311F, -0.8727F, 0.0873F, 0.0873F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -1.1F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0969F, 23.367F, -2.3686F, 0.0F, 0.0873F, 0.0873F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(8, 16).addBox(-1.0F, -1.3F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9825F, 23.1833F, -1.2491F, 0.4363F, 0.0873F, 0.0873F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(94, 93).addBox(-2.5F, -2.2F, -6.9F, 5.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3726F, 2.6212F, -1.1665F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(79, 68).addBox(-2.5F, -5.8F, -7.4F, 5.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3726F, 3.6168F, -0.551F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(101, 40).addBox(-2.5F, -3.4F, -5.6F, 5.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3726F, 8.0756F, 0.5245F, 2.618F, 0.0F, 0.0F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(22, 102).addBox(-2.5F, -1.5F, -6.0F, 5.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3726F, 15.4902F, 2.2634F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(74, 2).addBox(-0.9F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3274F, 18.4308F, 1.454F, 1.383F, 0.1157F, 0.096F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(42, 48).addBox(-0.75F, -1.0F, -2.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8648F, 20.9085F, 0.6719F, 0.8727F, 0.0873F, 0.0873F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -1.4F, -0.8F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1352F, 24.0F, -1.4F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 8).addBox(-0.9463F, 0.4472F, -0.5713F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1476F, 23.0378F, -2.6235F, 0.8727F, -0.4363F, 0.0436F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 75).addBox(-0.9771F, -0.0378F, -2.3589F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1476F, 23.0378F, -2.6235F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -1.0962F, -1.9837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1352F, 23.9755F, -4.55F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 11).addBox(-0.4771F, -1.0386F, -3.7592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1476F, 23.0378F, -2.6235F, 0.5236F, -0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefs.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((NightstalkerEntity) entity).idleanimationstate, ModAnimationDefs.WALK, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float ageInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -30.0F, 30.0F);

		this.head.yRot = pNetHeadYaw*((float)Math.PI / 180F);
		this.head.yRot = pHeadPitch*((float)Math.PI / 180F);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		DINO.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return DINO;
	}
}