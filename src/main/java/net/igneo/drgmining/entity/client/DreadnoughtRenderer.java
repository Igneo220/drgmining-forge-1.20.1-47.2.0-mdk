package net.igneo.drgmining.entity.client;

import net.igneo.drgmining.Drgmining;
import net.igneo.drgmining.entity.custom.DreadnoughtEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DreadnoughtRenderer extends GeoEntityRenderer<DreadnoughtEntity> {
    public DreadnoughtRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DreadnoughtModel());
    }
}
