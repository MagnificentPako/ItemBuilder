package me.niobium.util.itembuilder.parts;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

/**
 * Created by paul on 07.08.16.
 */
public class Skull extends Item {

    private SkullMeta meta;
    private ItemStack itemStack;
    private SkullMeta itemMeta;

    protected Skull(ItemStack itemStack) {
        this.itemStack = itemStack;
        this.itemMeta = (SkullMeta) itemStack.getItemMeta();
    }

    public Skull() {
        this(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3));
    }

}
