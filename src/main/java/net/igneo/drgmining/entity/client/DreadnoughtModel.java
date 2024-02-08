package net.igneo.drgmining.entity.client;

import net.igneo.drgmining.Drgmining;
import net.igneo.drgmining.entity.custom.DreadnoughtEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class DreadnoughtModel extends GeoModel<DreadnoughtEntity> {
    @Override
    public ResourceLocation getModelResource(DreadnoughtEntity dreadnoughtEntity) {
        return new ResourceLocation(Drgmining.MOD_ID, "geo/dreadnought.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DreadnoughtEntity dreadnoughtEntity) {
        return new ResourceLocation(Drgmining.MOD_ID, "textures/entity/dreadnought.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DreadnoughtEntity dreadnoughtEntity) {
        return new ResourceLocation(Drgmining.MOD_ID, "animations/dreadnought.animation.json");
    }
/*
    @Override
    public void setCustomAnimations(DreadnoughtEntity animatable, long instanceId, AnimationState<DreadnoughtEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("mouth");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }*/
}
