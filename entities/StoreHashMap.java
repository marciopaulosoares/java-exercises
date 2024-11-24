package entities;
import java.util.HashMap;
public class StoreHashMap {
    public static void main(String[] args) {

        HashMap<Integer,Product> map;
        map = new HashMap<Integer,Product>();
        map.put(1, new Product(1,"Product 01"));
        map.put(2, new Product(2,"Product 02"));

        int productIdToFind = 2;

        Product p = map.get(productIdToFind);
        if(p!= null)
        {
            System.out.print(String.format("find it! %s", p.getName() ));
        }
        else{
            System.out.println("not found");
        }

    }
}
