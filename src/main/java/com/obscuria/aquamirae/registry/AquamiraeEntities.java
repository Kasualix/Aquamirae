
package com.obscuria.aquamirae.registry;

import com.obscuria.aquamirae.world.entities.*;
import com.obscuria.aquamirae.world.entities.chakras.MazeRose;
import com.obscuria.aquamirae.world.entities.chakras.PoisonedChakra;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import com.obscuria.aquamirae.world.entities.GoldenMoth;
import com.obscuria.aquamirae.AquamiraeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AquamiraeEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AquamiraeMod.MODID);
	public static final RegistryObject<EntityType<GoldenMoth>> GOLDEN_MOTH = register("golden_moth",
			EntityType.Builder.<GoldenMoth>of(GoldenMoth::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
					.setUpdateInterval(3).setCustomClientFactory(GoldenMoth::new).fireImmune().sized(0.5f, 0.2f));
	public static final RegistryObject<EntityType<Maw>> MAW = register("maw",
			EntityType.Builder.<Maw>of(Maw::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(Maw::new).sized(1.2f, 1.2f));
	public static final RegistryObject<EntityType<Anglerfish>> ANGLERFISH = register("anglerfish",
			EntityType.Builder.<Anglerfish>of(Anglerfish::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(Anglerfish::new).sized(2f, 2.6f));
	public static final RegistryObject<EntityType<MazeMother>> MAZE_MOTHER = register("maze_mother",
			EntityType.Builder.<MazeMother>of(MazeMother::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
					.setUpdateInterval(3).setCustomClientFactory(MazeMother::new).sized(8f, 3f));
	public static final RegistryObject<EntityType<CaptainCornelia>> CAPTAIN_CORNELIA = register("captain_cornelia",
			EntityType.Builder.<CaptainCornelia>of(CaptainCornelia::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CaptainCornelia::new).fireImmune().sized(0.6f, 2.3f));
	public static final RegistryObject<EntityType<PillagersPatrol>> PILLAGERS_PATROL = register("pillagers_patrol",
			EntityType.Builder.<PillagersPatrol>of(PillagersPatrol::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(false).setTrackingRange(8)
					.setUpdateInterval(3).setCustomClientFactory(PillagersPatrol::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<TorturedSoul>> TORTURED_SOUL = register("tortured_soul",
			EntityType.Builder.<TorturedSoul>of(TorturedSoul::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TorturedSoul::new).sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Eel>> EEL = register("eel",
			EntityType.Builder.<Eel>of(Eel::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(Eel::new).sized(2.4f, 3.4f));
	public static final RegistryObject<EntityType<MazeRose>> MAZE_ROSE = register("maze_rose",
			EntityType.Builder.<MazeRose>of(MazeRose::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
					.setUpdateInterval(3).setCustomClientFactory(MazeRose::new).sized(0.7f, 0.125f));
	public static final RegistryObject<EntityType<PoisonedChakra>> POISONED_CHAKRA = register("poisoned_chakra",
			EntityType.Builder.<PoisonedChakra>of(PoisonedChakra::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PoisonedChakra::new).sized(0.7f, 0.125f));
	public static final RegistryObject<EntityType<Spinefish>> SPINEFISH = register("spinefish",
			EntityType.Builder.<Spinefish>of(Spinefish::new, MobCategory.WATER_AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(Spinefish::new).sized(0.7f, 0.7f));
	public static final RegistryObject<EntityType<LuminousJelly>> LUMINOUS_JELLY = register("luminous_jelly",
			EntityType.Builder.<LuminousJelly>of(LuminousJelly::new, MobCategory.WATER_AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(LuminousJelly::new).sized(0.5f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GOLDEN_MOTH.get(), GoldenMoth.createAttributes().build());
		event.put(MAW.get(), Maw.createAttributes().build());
		event.put(ANGLERFISH.get(), Anglerfish.createAttributes().build());
		event.put(MAZE_MOTHER.get(), MazeMother.createAttributes().build());
		event.put(CAPTAIN_CORNELIA.get(), CaptainCornelia.createAttributes().build());
		event.put(PILLAGERS_PATROL.get(), Mob.createMobAttributes().build());
		event.put(TORTURED_SOUL.get(), TorturedSoul.createAttributes().build());
		event.put(EEL.get(), Eel.createAttributes().build());
		event.put(SPINEFISH.get(), Mob.createMobAttributes().build());
		event.put(LUMINOUS_JELLY.get(), Mob.createMobAttributes().build());

		event.put(POISONED_CHAKRA.get(), Mob.createMobAttributes().build());
		event.put(MAZE_ROSE.get(), Mob.createMobAttributes().build());
	}

	@SubscribeEvent
	public static void registerSpawns(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SpawnPlacements.register(AquamiraeEntities.GOLDEN_MOTH.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) ->
					world instanceof Level level && !level.isDay());
			SpawnPlacements.register(AquamiraeEntities.SPINEFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) ->
					world.getBlockState(pos).getBlock() instanceof LiquidBlock);

			SpawnPlacements.register(AquamiraeEntities.MAW.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) ->
					pos.getY() < world.getSeaLevel() + 6);
			SpawnPlacements.register(AquamiraeEntities.ANGLERFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR, (entityType, world, reason, pos, random) ->
					!(world.getDifficulty() == Difficulty.PEACEFUL));
			SpawnPlacements.register(AquamiraeEntities.PILLAGERS_PATROL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) ->
					Mob.checkMobSpawnRules(entityType, world, reason, pos, random) && (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random)));
			SpawnPlacements.register(AquamiraeEntities.TORTURED_SOUL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) ->
					Mob.checkMobSpawnRules(entityType, world, reason, pos, random) && (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random)));
		});
	}
}
