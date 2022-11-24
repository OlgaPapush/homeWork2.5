import ProductList.ProductList;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static Number.Number.numberSetRemoveEven;
import static Number.Task.checkTheTask;

public class Main {    public static void main(String[] args) {

//Task 1
    Product milk = new Product("молоко", 51, 2);
    Product bread = new Product("хлеб", 40, 1);
    Product egg = new Product("яйцо куриное", 90, 10);
    Product cheez = new Product("сыр", 250, 1);
    ProductList productList = new ProductList();
    ProductList.addProductToList("молоко");
    ProductList.addProductToList("хлеб");
    ProductList.addProductToList("яйцо куриное");
    ProductList.addProductToList("сыр");
    System.out.println(ProductList.toString());



    //Task 3

    System.out.println(numberSetRemoveEven());

    //Task 4

    System.out.println(checkTheTask());



    }


}






