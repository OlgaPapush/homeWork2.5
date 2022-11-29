package ProductList;

import ProductList.Product;
import ProductList.Recipe;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetOfRecipe {
    public static Map<Product, Integer> recipe = new HashMap<>();

    public static void addRecipe(Recipe recipe) {
        for (var recipeInCollection : recipe) {
            if (recipeInCollection.getRecipesName().equals(recipe.getRecipesName())) {
                throw new RuntimeException("Такой рецепт уже есть");
            }
        }
        recipe.add(recipe);
    }

    public void addProduct(Product product, int amount) {
        if (amount <= 0){
            amount = 1;}
        if (this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + quantity)
        } else {
            this.products.put(product, quantity);
        }
    }
    public float getRecipePrice() {
        float sum = 0;
        for (Map.Entry<Product, Integer> product : this.products.entrySet())
        sum += product.getKey().product.getPrice * product.getValue(); {
            sum == product.getPrice();
        }
        return sum;
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
