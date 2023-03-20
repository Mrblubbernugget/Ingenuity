package net.mrblubbernugget.mensch.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrblubbernugget.mensch.Mensch;
import net.mrblubbernugget.mensch.entity.projectile.PebbleProjectile;


public class MenschEntities {
    public static DeferredRegister<EntityType<?>> MENSCH_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Mensch.MOD_ID);

    public static final RegistryObject<EntityType<PebbleProjectile>> PEBBLE_ENTITY = MENSCH_ENTITY_TYPES.register("pebble_entity",
            () -> EntityType.Builder.of((EntityType.EntityFactory<PebbleProjectile>) PebbleProjectile::new, MobCategory.MISC ).sized(0.5f, 0.5f).build("pebble_entity"));


}
