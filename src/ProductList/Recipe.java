package ProductList;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String recipesName;
    private final Set<Product> product = new HashSet<Product>();
    private int totalCastResipe;

    public Recipe(String recipesName, int totalCastResipe) {
        this.recipesName = recipesName;
        this.totalCastResipe = 0;
        recipe.add(this);
    }
    public void addProductToRecipe(Product product, int requreQuantity){
        if(product.contains(product)){
            throw new RuntimeException("Продукт уже существует");
        }
        product.add(product);
        totalCastResipe = totalCastResipe + product.getPrice() * requreQuantity;
    }

    @Override
    public String toString() {
        return "ProductList.Recipe{" +
                "recipesName='" + recipesName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return totalCastResipe == recipe.totalCastResipe && recipesName.equals(recipe.recipesName) && product.equals(recipe.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipesName, product, totalCastResipe);
    }

    public String getRecipesName() {
        return recipesName;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public int getTotalCastResipe() {
        return totalCastResipe;
    }
}
