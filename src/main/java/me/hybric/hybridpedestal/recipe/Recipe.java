package me.hybric.hybridpedestal.recipe;

import org.bukkit.inventory.ItemStack;
import java.util.List;

public class Recipe {
    private final ItemStack result;
    private final List<Ingredient> ingredients;

    public Recipe(ItemStack result, List<Ingredient> ingredients) {
        this.result = result;
        this.ingredients = ingredients;
    }

    public ItemStack getResult() {
        return result;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
