package com.obscuria.aquamirae.world.entities;

import com.obscuria.aquamirae.registry.AquamiraeEntities;
import com.obscuria.aquamirae.registry.AquamiraeItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractSchoolingFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;
import org.jetbrains.annotations.NotNull;

public class LuminousJelly extends AbstractSchoolingFish implements IShipGraveyardEntity {

    public LuminousJelly(EntityType<? extends LuminousJelly> type, Level level) {
        super(type, level);
    }

    public LuminousJelly(PlayMessages.SpawnEntity packet, Level level) {
        this(AquamiraeEntities.LUMINOUS_JELLY.get(), level);
    }

    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(AquamiraeItems.SPINEFISH_BUCKET.get());
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.COD_AMBIENT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.COD_DEATH;
    }

    protected SoundEvent getHurtSound(@NotNull DamageSource source) {
        return SoundEvents.COD_HURT;
    }

    protected @NotNull SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }
}
