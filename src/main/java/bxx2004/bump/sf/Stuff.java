 package bxx2004.bump.sf;
 


import bxx2004.bump.Bump;
import bxx2004.bump.util.Register;
import bxx2004.bump.util.SfItemStackCreate;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;



import org.bukkit.plugin.Plugin;

 public class Stuff
 {
   public static SlimefunItemStack sunEnergy_;
   public static SlimefunItemStack mechaGeat_;
   public static SlimefunItemStack oldCoin_;
   public static SlimefunItemStack make_;
   public static SlimefunItemStack oldCPU_;
   public static SlimefunItemStack CPU_;
   public static SlimefunItemStack soulPaper_;
   public static SlimefunItemStack ksf_;
   public static SlimefunItemStack waterSugar_;
   public static SlimefunItemStack peachwood_;
   public static SlimefunItemStack upDatePower_ = (new SfItemStackCreate("UPDATE_POWER", Material.ZOMBIE_HEAD, "&e升级核心", new String[] { "", "&b&k|&b- 用来升级一些奇怪的物品...", "" })).get();
   
   public ItemGroup stuff;
   
   static {
     sunEnergy_ = (new SfItemStackCreate("SUN_ENERGY", Material.SUNFLOWER, "&e光合能量", new String[] { "", "&b&k|&b- 变异的植物也会进行光合作用...", "" })).get();
     mechaGeat_ = (new SfItemStackCreate("MECHA_GEAR", Material.ENDER_PEARL, "&e机械齿轮", new String[] { "", "&b&k|&b- 某大型工厂淘汰下来的东西...", "" })).get();
     oldCoin_ = (new SfItemStackCreate("OLD_COIN", Material.GOLD_NUGGET, "&e破损的的金币", new String[] { "", "&b&k|&b- 这东西能买什么...", "" })).get();
     make_ = (new SfItemStackCreate("MAKE", Material.DIAMOND, "&e计算机工艺核心", new String[] { "", "&b&k|&b- 它用来干什么呢...", "" })).get();
     oldCPU_ = (new SfItemStackCreate("OLD_CPU", Material.PRISMARINE_CRYSTALS, "&e破损的CPU", new String[] { "", "&b&k|&b- 从哪家的电脑上拆下来的...", "" })).get();
     CPU_ = (new SfItemStackCreate("CPU", Material.DIAMOND, "&eCPU", new String[] { "", "&b&k|&b- 完好无损...", "" })).get();
     soulPaper_ = (new SfItemStackCreate("SOUL_PAPER", Material.PAPER, "&e灵魂之符", new String[] { "", "&b&k|&b- 被注入了灵魂的力量", "" })).get();
     ksf_ = (new SfItemStackCreate("KSF_STUFF", Material.BEETROOT_SEEDS, "&e方便面调料", new String[] { "", "&b&k|&b- 嘶~ 是香辣味的", "" })).get();
     waterSugar_ = (new SfItemStackCreate("WATER_SUGAR", Material.SUGAR, "&E汽水糖", new String[] { "", "&b&k|&b- 雪碧? 还是可口可乐?", "" })).get();
     peachwood_ = (new SfItemStackCreate("PEACH_WOOD", Material.STICK, "&e桃木", new String[] { "", "&b&k|&b- 驱邪避难", "" })).get();
   }
   
   public Stuff(SlimefunAddon plugin) {
     this.stuff = new ItemGroup(new NamespacedKey(Bump.getPlugin(Bump.class), "Stuff"), new CustomItemStack(Material.NETHER_STAR, "&bBump-魔法物品",  "", "&b&k|&b- 点击打开 >", "", "&7在生活中发生变异的一些物品!", "他们可能含有未知的力量..." ));
     this.stuff.register(plugin);
     SlimefunItem upDatePower = new SlimefunItem(this.stuff, upDatePower_, RecipeType.MAGIC_WORKBENCH, new ItemStack[] { SlimefunItems.POWER_CRYSTAL, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.POWER_CRYSTAL, SlimefunItems.LAVA_CRYSTAL, CPU_, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.GOLD_24K, SlimefunItems.GOLD_24K, SlimefunItems.GOLD_24K });
     SlimefunItem peachwood = new SlimefunItem(this.stuff, peachwood_, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] { new ItemStack(Material.ACACIA_WOOD), new ItemStack(Material.BIRCH_WOOD), new ItemStack(Material.DARK_OAK_WOOD) });
     SlimefunItem soulPaper = new SlimefunItem(this.stuff, soulPaper_, RecipeType.ANCIENT_ALTAR, new ItemStack[] { SlimefunItems.MAGIC_LUMP_1, SlimefunItems.ESSENCE_OF_AFTERLIFE, SlimefunItems.MAGIC_LUMP_1, SlimefunItems.SOULBOUND_RUNE, SlimefunItems.SOULBOUND_RUNE, SlimefunItems.SOULBOUND_RUNE, SlimefunItems.MAGIC_LUMP_1, SlimefunItems.ESSENCE_OF_AFTERLIFE, SlimefunItems.MAGIC_LUMP_1 });
     SlimefunItem ksf = new SlimefunItem(this.stuff, ksf_, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] { SlimefunItems.SALT, SlimefunItems.SALT, SlimefunItems.SALT, SlimefunItems.CARROT_FERTILIZER, SlimefunItems.CARROT_FERTILIZER, SlimefunItems.CARROT_FERTILIZER, SlimefunItems.SALT, SlimefunItems.SALT, SlimefunItems.SALT });
     SlimefunItem watersugar = new SlimefunItem(this.stuff, waterSugar_, RecipeType.PRESSURE_CHAMBER, new ItemStack[] { SlimefunItems.MAGIC_SUGAR });
     SlimefunItem sunEnergy = new SlimefunItem(this.stuff, sunEnergy_, RecipeType.MAGIC_WORKBENCH, new ItemStack[] { new ItemStack(Material.CHORUS_FLOWER, 1), new ItemStack(Material.SUNFLOWER, 1), new ItemStack(Material.CHORUS_FLOWER, 1) });
     SlimefunItem mechaGeat = new SlimefunItem(this.stuff, mechaGeat_, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] { SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.COPPER_WIRE, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD });
     SlimefunItem oldCoin = new SlimefunItem(this.stuff, oldCoin_, RecipeType.ARMOR_FORGE, new ItemStack[] { null, null, null, null, new CustomItemStack(Material.DIAMOND_SHOVEL, "&e&o获取方式: ","&7&o摸金铲也许对他有点作用..." ) });
     SlimefunItem make = new SlimefunItem(this.stuff, make_, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] { SlimefunItems.BATTERY, SlimefunItems.BATTERY, SlimefunItems.BATTERY, SlimefunItems.COOLING_UNIT, SlimefunItems.POWER_CRYSTAL, SlimefunItems.COOLING_UNIT, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD });
     SlimefunItem oldCPU = new SlimefunItem(this.stuff, oldCPU_, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] { SlimefunItems.COPPER_WIRE, SlimefunItems.COPPER_WIRE, SlimefunItems.COPPER_WIRE, SlimefunItems.COPPER_WIRE, make.getItem(), SlimefunItems.COPPER_WIRE, SlimefunItems.COPPER_WIRE, SlimefunItems.COPPER_WIRE, SlimefunItems.COPPER_WIRE });
     SlimefunItem CPU = new SlimefunItem(this.stuff, CPU_, RecipeType.COMPRESSOR, new ItemStack[] { oldCPU.getItem() });
   }
 }
