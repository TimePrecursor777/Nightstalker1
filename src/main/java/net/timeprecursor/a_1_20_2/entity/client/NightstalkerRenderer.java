package net.timeprecursor.a_1_20_2.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.timeprecursor.a_1_20_2.A_1_20_2;
import net.timeprecursor.a_1_20_2.entity.custom.NightstalkerEntity;

public class NightstalkerRenderer extends MobRenderer<NightstalkerEntity, nightstalkermodel<NightstalkerEntity> {
    public NightstalkerRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new nightstalkermodel<>(pContext.bakeLayer(ModModelLayers.DINO_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(NightstalkerEntity nightstalkerEntity) {
        return new ResourceLocation(A_1_20_2.MODID, "textrues/entity/dinotexture.png");

    }

    @Override
    public void render(NightstalkerEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
