package net.mrblubbernugget.ingenuity.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.mrblubbernugget.ingenuity.entity.projectile.PebbleProjectile;

public class PebbleItem extends Item {
    public PebbleItem(Item.Properties pProperties) {
        super(pProperties);
    }


    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);
        if (!pLevel.isClientSide && pHand == InteractionHand.MAIN_HAND) {
            pLevel.playSound((Player)null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (pLevel.getRandom().nextFloat() * 0.4F + 0.8F));
            PebbleProjectile pebbleProjectile = new PebbleProjectile(pLevel, pPlayer);
            pebbleProjectile.setItem(itemstack);
            pebbleProjectile.moveTo(pPlayer.getX(), pPlayer.getEyeY(), pPlayer.getZ(), pPlayer.getXRot(), pPlayer.getYRot());
            pebbleProjectile.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), 0.0f, 0.75F, 1.0F);
            pLevel.addFreshEntity(pebbleProjectile);
            pPlayer.getCooldowns().addCooldown(this,10);
        }

        pPlayer.awardStat(Stats.ITEM_USED.get(this));
        if (!pPlayer.getAbilities().instabuild) {
            itemstack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(itemstack, pLevel.isClientSide());
    }
}
