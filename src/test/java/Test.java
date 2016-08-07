import me.niobium.util.itembuilder.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by paul on 07.08.16.
 */
public class Test {

    public void mu() {
        ItemStack itemStack = ItemBuilder.buildItem(item -> {
            item.setMaterial(Material.STONE);
            item.setAmount(5);
            item.setDisplayName("The Magic Stone");
            item.setLore("Listen!", "This stone is magical!");
        });
    }

}
