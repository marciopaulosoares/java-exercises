package objects;

public class OrderOfInitialization {

    //Order of initialization:
    //1. fields and instance initializer blocks in order in which they appear
    //2. constructor runs in the end

    private String name = "chip";

    public OrderOfInitialization() {
        this.name = "Teddy";
        System.out.println("Inside the constructor");
    }

    {
        System.out.println("Inside the initializer block...");
    }

    public static void main(String[] args) {
        OrderOfInitialization test = new OrderOfInitialization();
        System.out.println(test.name);
    }

    /*
    Result:
    Inside the initializer block...
    Inside the constructor
    Teddy
     */
}
