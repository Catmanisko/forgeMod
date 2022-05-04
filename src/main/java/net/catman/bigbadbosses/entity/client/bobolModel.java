package net.catman.bigbadbosses.entity.client;

import net.catman.bigbadbosses.bbbcoursemod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class bobolModel extends AnimatedGeoModel {
    @Override
    public void setLivingAnimations(Object entity, Integer uniqueID, AnimationEvent customPredicate) {

    }

    @Override
    public ResourceLocation getModelLocation(Object object) {
        return new ResourceLocation(bbbcoursemod.MOD_ID, "geo/bobol.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object object) {
        return new ResourceLocation(bbbcoursemod.MOD_ID, "textures/entity/bobol/bobol.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Object animatable) {
        return new ResourceLocation(bbbcoursemod.MOD_ID, "animations/bobol.animation.json");
    }
}
