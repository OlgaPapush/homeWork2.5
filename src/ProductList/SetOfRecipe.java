package ProductList;

import ProductList.Product;
import ProductList.Recipe;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetOfRecipe {
    public static Set<Recipe> recipe = new HashSet<>();

    public static void addRecipe(Recipe recipe) {
        for (var recipeInCollection : recipe) {
            if (recipeInCollection.getRecipesName().equals(recipe.getRecipesName())) {
                throw new RuntimeException("Такой рецепт уже есть");
            }
        }
        recipe.add(recipe);
    }

    public static void printAllRecipe() {
        System.out.println("Книга рецептов");
        for (Recipe recipe : recipe) {
            System.out.println(recipe.getRecipesName() + ":");
            for (Map.Entry<Product, Integer> entry : recipe.getProduct().entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " кг, ");
            }
            System.out.println("Общая стоимость продуктов" + recipe.getTotalCastResipe() + "руб");
        }
    }
}
