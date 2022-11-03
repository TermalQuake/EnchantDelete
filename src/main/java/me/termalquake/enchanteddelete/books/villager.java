package me.termalquake.enchanteddelete.books;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.MerchantInventory;
import org.bukkit.inventory.MerchantRecipe;

public class villager implements Listener {

    @EventHandler
    private void onAttemptTrade(InventoryOpenEvent event) {
        Inventory inventory = event.getInventory();
        if (!(inventory.getHolder() instanceof org.bukkit.entity.Villager))
            return;
        if (!(inventory instanceof MerchantInventory))
            return;
        Merchant merchant = ((MerchantInventory)inventory).getMerchant();
        List<MerchantRecipe> recipes = new ArrayList<>(merchant.getRecipes());
        merchant.getRecipes().forEach(recipe -> {
            ItemStack result = recipe.getResult();
            if (result.getType() == Material.ENCHANTED_BOOK) {
                recipes.remove(recipe);
            }
            if (result.getEnchantments().size() > 0) {
                recipes.remove(recipe);
            }
        });
        merchant.setRecipes(recipes);
    }
}
