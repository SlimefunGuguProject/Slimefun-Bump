package bxx2004.bump.setup;

import bxx2004.bump.Bump;
import bxx2004.bump.slimefun.BumpItems;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import org.bukkit.inventory.ItemStack;

public final class ResearchSetup {
    private static int researchId = 114514;

    private ResearchSetup() {}

    public static void setup() {
        createResearch("food", 15, BumpItems.XUEBI, BumpItems.KELE, BumpItems.FANGBIANMIAN, BumpItems.LATIAO, BumpItems.KOUXIANGTANG);
        createResearch("random_equipment", 12, BumpItems.RANDOM_HELMET, BumpItems.RANDOM_SWORD);
        createResearch("appraise", 25, BumpItems.APPRAISAL, BumpItems.APPRAISAL_PAPER_ARMOR, BumpItems.APPRAISAL_PAPER_DAMAGE);
        createResearch("stuff", 15, BumpItems.SUN_ENERGY, BumpItems.MECHA_GEAR, BumpItems.MAKE, BumpItems.OLD_CPU, BumpItems.CPU, BumpItems.SOUL_PAPER, BumpItems.KSF_STUFF, BumpItems.WATER_SUGAR, BumpItems.UPDATE_POWER);
        createResearch("old_stuff", 5, BumpItems.OLD_COIN, BumpItems.GETGOLD_SPADE);
        createResearch("bow", 11, BumpItems.LIGHT_BOW, BumpItems.WITHERSKULL_BOW);
        createResearch("peach_sword", 10, BumpItems.PEACH_WOOD, BumpItems.PEACH_SWORD);
        createResearch("normal_sword", 14, BumpItems.EMER_SWORD, BumpItems.BONE_SWORD, BumpItems.GUARD_SWORD);
        createResearch("soul_sword", 6, BumpItems.SOUL_SWORD);
        createResearch("sky_devil", 6, BumpItems.SKY_SWORD, BumpItems.DEVIL_SWORD, BumpItems.SKY_DEVIL_SWORD);
    }

    private static void createResearch(String key, int cost, ItemStack... itemStacks){
        new Research(Bump.createKey("research_" + key), ++researchId, Bump.getLocalization().getResearchName("key"), cost)
            .addItems(itemStacks).register();
    }

}
