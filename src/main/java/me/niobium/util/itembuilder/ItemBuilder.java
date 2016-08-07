package me.niobium.util.itembuilder;

import me.niobium.util.itembuilder.parts.Item;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by paul on 07.08.16.
 */
public class ItemBuilder {

    private ItemBuilder() {}

    public static ItemStack buildItem(ItemStack itemStack, IItemBuilder builder) {
        Item item = new Item(itemStack);
        builder.build(item);
        return item.toItemStack();
    }

    public static ItemStack buildItem(IItemBuilder builder) {
        return buildItem(new ItemStack(Material.STONE), builder);
    }

}
