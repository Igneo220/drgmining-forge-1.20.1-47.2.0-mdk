package net.igneo.drgmining.event;

import net.igneo.drgmining.Drgmining;
import net.igneo.drgmining.entity.ModEntities;
import net.igneo.drgmining.entity.custom.DreadnoughtEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid = Drgmining.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void EntityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.DREADNOUGHT.get(), DreadnoughtEntity.setAttributes());
    }
}
