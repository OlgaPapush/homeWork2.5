import Passport.Passport;
import ProductList.ProductList;
import Telephone.Telephone;
import Telephone.FullName;

import java.awt.print.Book;
import java.util.*;

import static Number.Number.numberSetRemoveEven;
import static Number.Task.checkTheTask;

public class Main {
    public static void main(String[] args) {

//Task 1
//        Product milk = new Product("молоко", 51, 2);
//        Product bread = new Product("хлеб", 40, 1);
//        Product egg = new Product("яйцо куриное", 90, 10);
//        Product cheez = new Product("сыр", 250, 1);
//        ProductList productList = new ProductList();
//        ProductList.addProductToList("молоко");
//        ProductList.addProductToList("хлеб");
//        ProductList.addProductToList("яйцо куриное");
//        ProductList.addProductToList("сыр");
//        System.out.println(ProductList.toString());


        //Task 3
        //       numberSetRemoveEven();
        //       System.out.println(numberSetRemoveEven());


        //Task 4

//        System.out.println(checkTheTask());

//        Passport.addPassport(new Passport(561367978, "Лысенкова", "Анна", "Юрьевна", 10.12 .1993));
//        Passport.addPassport(new Passport(561345678, "Сапожникова", "Александра", "Дмитриевна", 03.11 .1993));
        //       Passport.addPassport(new Passport(562345678, "Кузьмина", "Юлия", "Юрьевна", 16.08 .1993));
        //       Passport.addPassport(new Passport(568765432, "Толстых", "Владимир", "Юрьевич", 25.09 .1998));


        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(3, "3");
        orderedMap.put(7, "7");
        orderedMap.put(1, "1");
        orderedMap.put(4, "4");
        orderedMap.put(2, "2");
        orderedMap.put(5, "5");
        orderedMap.put(9, "9");
        orderedMap.put(10, "10");
        orderedMap.put(8, "8");
        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.println("%d:%s%n" + entry.getKey() + entry.getValue());
        }


    }


}






