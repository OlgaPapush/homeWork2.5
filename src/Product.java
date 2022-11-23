import java.util.Objects;

public class Product {
    private final String name;
    private final int price;
    private final int amount;


    public Product(String name, int price, int amount) {
        if (name != null && !name.isBlank() && !name.isEmpty() && !(price > 0)) {
            this.name = name;
            this.price = price;
            this.amount = amount;
            addProductToList(this);
        } else {
            throw new RuntimeException("Проверь позицию товара" + name);
        }
    }




    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }



    @Override
    public String toString() {
        return "Список продуктов{" +
                "наименование " + getName() +
                ", цена " + getPrice() + " рублей " +
                ", количество " + getAmount() +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
