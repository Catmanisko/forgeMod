
package net.catman.bigbadbosses.entity;

import net.catman.bigbadbosses.bbbcoursemod;
import net.catman.bigbadbosses.entity.custom.bobolEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, bbbcoursemod.MOD_ID);

    public static final RegistryObject<EntityType<bobolEntity>> BOBOL = ENTITY_TYPES.register("bobol",
            () -> EntityType.Builder.of(bobolEntity::new, MobCategory.CREATURE)
                    .sized(2f, 4f)
                    .build(new ResourceLocation(bbbcoursemod.MOD_ID, "bobol").toString()));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
