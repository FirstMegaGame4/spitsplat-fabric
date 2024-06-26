package fr.firstmegagame4.spitsplat.init;

import fr.firstmegagame4.spitsplat.SpitSplat;
import fr.firstmegagame4.spitsplat.entity.BubbleEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class SpitSplatEntities {

	public static final EntityType<BubbleEntity> BUBBLE = EntityType.Builder.<BubbleEntity>create(BubbleEntity::new, SpawnGroup.MISC)
			.makeFireImmune()
			.dimensions(0.5f, 0.5f)
			.maxTrackingRange(8)
			.trackingTickInterval(1)
			.build();

	public static void register() {
		Registry.register(Registries.ENTITY_TYPE, SpitSplat.createId("bubble_projectile"), SpitSplatEntities.BUBBLE);
	}
}
