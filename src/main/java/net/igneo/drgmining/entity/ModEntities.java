package net.igneo.drgmining.entity;

import net.igneo.drgmining.Drgmining;
import net.igneo.drgmining.entity.custom.DreadnoughtEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Drgmining.MOD_ID);

    public static final RegistryObject<EntityType<DreadnoughtEntity>> DREADNOUGHT =
            ENTITY_TYPES.register("dreadnought",
                    () -> EntityType.Builder.of(DreadnoughtEntity::new, MobCategory.MONSTER)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(Drgmining.MOD_ID, "dreadnought").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
