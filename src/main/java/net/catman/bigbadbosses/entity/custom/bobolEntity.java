package net.catman.bigbadbosses.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.level.Level;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class bobolEntity extends Ghast implements IAnimatable {
    public bobolEntity(EntityType<? extends Ghast> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void registerControllers(AnimationData data) {

    }

    @Override
    public AnimationFactory getFactory() {
        return null;
    }
}
