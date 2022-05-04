package net.catman.bigbadbosses.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.catman.bigbadbosses.bbbcoursemod;
import net.catman.bigbadbosses.entity.custom.bobolEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class bobolRenderer extends GeoEntityRenderer<bobolEntity> {
    public bobolRenderer(EntityRendererProvider.Context renderManager, AnimatedGeoModel<bobolEntity> modelProvider) {
        super(renderManager, new bobolModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(bobolEntity instance) {
        return new ResourceLocation(bbbcoursemod.MOD_ID, "textures/entity/bobol/bobol.png");
    }

    @Override
    public RenderType getRenderType(bobolEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}


