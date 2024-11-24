package lambdas;

import entities.Product2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperationsSorted {

    public static void main(String[] args) {
        //Return a stream with the elements sorted
        //Just lik sorting arrays, Java uses natural ordering
        //unless we provide a comparator
        //Is a stateful intermediate operation; it needs to see all
        //of the data before it can sort it.
        //Stream<T> sorted(Comparator<T> comparator)

        List<Product2> listOfProduct = new ArrayList<Product2>();

        listOfProduct.add(new Product2(1, "Computer 1", 2000));
        listOfProduct.add(new Product2(2, "Mouse 2 ", 1000));
        listOfProduct.add(new Product2(3, "NoBreak 3", 1680));
        listOfProduct.add(new Product2(4, "Mesa 4", 1525));
        listOfProduct.add(new Product2(5, "Cadeira 5", 1425));
        listOfProduct.add(new Product2(6, "Anotacao 6", 1120));

        listOfProduct.stream().forEach((p) ->{
            System.out.println(p.getName());
        });

        System.out.println("Product order by name -------------------------------------------------");

        listOfProduct.stream().sorted(Comparator.comparing(Product2::getName)).forEach((p) ->{
            System.out.println(p.getName());
        });

        System.out.println("Product order by name II -------------------------------------------------");


        listOfProduct.stream().sorted(Comparator.comparing(p -> p.getPrice())).forEach((p) ->{
            System.out.println(p.getName());
        });


        System.out.println("Product by major pricing -------------------------------------------------");

        Product2 mostValuable = listOfProduct.stream().max(Comparator.comparing(p -> p.getPrice())).orElse(null);

        if(mostValuable != null){
            System.out.println("Most Valuable: " + mostValuable.getName());
        }

        thepipeline(listOfProduct);
    }

    private static long thepipeline(List<Product2> products){
        return products
                .stream() // create the stream
                .peek(System.out::println)
                .filter( product -> product.getPrice() > 1680) // filter it
                .peek(System.out::println) // show the value Computer 12000.0
                .count(); // 1


    }
}
