package io.github.thebutterbrotman.just_enough_hammers.common.item;

import io.github.thebutterbrotman.just_enough_hammers.JustEnoughHammers;
import io.github.thebutterbrotman.just_enough_hammers.common.item.impl.HammerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Wooden
    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer"
            , new HammerItem(6, ToolMaterials.WOOD, 6, -3.2F));
    //Above is a typical setting for hammerItem.
    //Tool material is mainly used for defining a default durability(will be overridden by Item.Settings.maxDamage(*) so no worry :D ), also defining the item
    //to be used for repairing. There's a problem that if we want to define dirtmond material for dirtmond hammer, we may have to use its API. What's more, maybe
    //we couldn't launch the mod if dirtmond mod is absent. I suggest NOT making the hammer items repairable, or get another new way for the players to repair it
    //This "attack damage(6)" is not always the true damage, which is 6 + the tool material's damage.
    //For example if we make a new hammerItem made of stone, whose material attack damage is 1 by default. The final damage will be 6 + 1 -> 7.

    //Stone
    public static final Item STONE_HAMMER = registerItem("stone_hammer"
            , new HammerItem(14, ToolMaterials.STONE, 6, -3.2F));

    //Iron
    public static final Item IRON_HAMMER = registerItem("iron_hammer"
            , new HammerItem(27, ToolMaterials.IRON, 6, -3.2F));

    //Golden
    public static final Item GOLDEN_HAMMER = registerItem("golden_hammer"
            , new HammerItem(6, ToolMaterials.GOLD, 6, -3.2F));

    //Diamond
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer"
            , new HammerItem(173, ToolMaterials.DIAMOND, 6, -3.2F));

    //Netherite
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer"
            , new HammerItem(225, ToolMaterials.NETHERITE, 6, -3.2F));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(JustEnoughHammers.MOD_ID, name), item);
    }

    public static void registerItems() {

    }

}
