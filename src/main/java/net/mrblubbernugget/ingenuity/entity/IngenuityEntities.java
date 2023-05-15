package net.mrblubbernugget.ingenuity.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrblubbernugget.ingenuity.Ingenuity;
import net.mrblubbernugget.ingenuity.entity.projectile.PebbleProjectile;


public class IngenuityEntities {
    public static DeferredRegister<EntityType<?>> INGENUITY_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Ingenuity.MOD_ID);

    public static final RegistryObject<EntityType<PebbleProjectile>> PEBBLE_ENTITY = INGENUITY_ENTITY_TYPES.register("pebble_entity",
            () -> EntityType.Builder.of((EntityType.EntityFactory<PebbleProjectile>) PebbleProjectile::new, MobCategory.MISC ).sized(0.5f, 0.5f).build("pebble_entity"));


}
