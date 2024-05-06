package streams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> listOfProduct = new ArrayList<Product>();

        listOfProduct.add(new Product(1, "Computer 1", 2000));
        listOfProduct.add(new Product(2, "Mouse 2 ", 1000));
        listOfProduct.add(new Product(3, "NoBreak 3", 1680));
        listOfProduct.add(new Product(4, "Mesa 4", 1525));
        listOfProduct.add(new Product(5, "Cadeira 5", 1425));
        listOfProduct.add(new Product(6, "Anotacao 6", 1120));

        listOfProduct.stream().forEach((p) ->{
            System.out.println(p.getName());
        });

        System.out.println("Product order by name -------------------------------------------------");

        listOfProduct.stream().sorted(Comparator.comparing(Product::getName)).forEach((p) ->{
            System.out.println(p.getName());
        });

        System.out.println("Product order by name II -------------------------------------------------");


        listOfProduct.stream().sorted(Comparator.comparing(p -> p.getPrice())).forEach((p) ->{
            System.out.println(p.getName());
        });


        System.out.println("Product by major pricing -------------------------------------------------");

        Product mostValuable = listOfProduct.stream().max(Comparator.comparing(p -> p.getPrice())).orElse(null);

        if(mostValuable != null){
            System.out.println("Most Valuable: " + mostValuable.getName());
        }
        
        
    }
}
