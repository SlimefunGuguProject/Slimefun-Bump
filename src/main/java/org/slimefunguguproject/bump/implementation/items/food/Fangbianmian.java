package org.slimefunguguproject.bump.implementation.items.food;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import org.slimefunguguproject.bump.implementation.BumpItems;
import org.slimefunguguproject.bump.utils.Utils;

/**
 * Instant noodle.
 *
 * @author ybw0014
 */
public class Fangbianmian extends ItemFood {

    public Fangbianmian() {
        super(BumpItems.FANGBIANMIAN, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
            new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.WATER_BUCKET),
            BumpItems.KSF_STUFF, BumpItems.KSF_STUFF, BumpItems.KSF_STUFF,
            SlimefunItems.WHEAT_FLOUR, SlimefunItems.WHEAT_FLOUR, SlimefunItems.WHEAT_FLOUR
        });
    }

    @Override
    public void applyFoodEffects(Player p) {
        Utils.setFoodLevel(p, 20);
        p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1500, 5));
    }
}
