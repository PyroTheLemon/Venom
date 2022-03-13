package com.willfp.ecoenchants.enchantments.ecoenchants.normal;

import com.willfp.ecoenchants.enchantments.EcoEnchant;
import com.willfp.ecoenchants.enchantments.meta.EnchantmentType;
import com.willfp.ecoenchants.enchantments.util.EnchantmentUtils;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class Venom extends EcoEnchant {
  public Venom() {
    super("venom", EnchantmentType.NORMAL, new com.willfp.eco.core.Prerequisite[0]);
  }
  
  public String getPlaceholder(int paramInt) {
    return EnchantmentUtils.chancePlaceholder(this, paramInt);
  }
  
  public void onMeleeDamage(@NotNull LivingEntity paramLivingEntity1, @NotNull LivingEntity int paramInt, @NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {
	    if (!EnchantmentUtils.isFullyChargeIfRequired(this, paramLivingEntity1))
      return; 
    paramLivingEntity2.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, paramInt * 10 + 20, paramInt));
  }
}
