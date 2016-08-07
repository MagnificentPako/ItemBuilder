package me.niobium.util.itembuilder.parts;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.Arrays;
import java.util.List;

/**
 * Created by paul on 07.08.16.
 */
public class Item {

    private ItemStack itemStack;
    private ItemMeta itemMeta;

    private List<String> lore;

    public Item(ItemStack itemStack) {
        this.itemStack = itemStack;
        this.itemMeta = itemStack.getItemMeta();
    }

    public Item() {
        this(new ItemStack(Material.STONE));
    }

    public void setMaterial(Material material) {
        this.itemStack.setType(material);
    }

    public void setData(byte data) {
        this.itemStack.getData().setData(data);
    }

    public void setDisplayName(String name) {
        this.itemMeta.setDisplayName(name);
    }

    public void setAmount(int amount) {
        this.itemStack.setAmount(amount);
    }

    public void setDurability(short durability) {
        this.itemStack.setDurability(durability);
    }

    public void setLore(String... lore) {
        this.lore = Arrays.asList(lore);
    }

    public void addLore(String lore) {
        this.lore.add(lore);
    }

    public void removeLore(String lore) {
        this.lore.remove(lore);
    }

    public void removeLore(int pos) {
        this.lore.remove(pos);
    }

    public List<String> getLore() {
        return this.lore;
    }

    public String getLore(int pos) {
        if(pos > lore.size()-1) return null;
        return lore.get(pos);
    }

    public ItemStack toItemStack() {
        this.itemMeta.setLore(this.lore);
        this.itemStack.setItemMeta(this.itemMeta);
        return this.itemStack;
    }

}
