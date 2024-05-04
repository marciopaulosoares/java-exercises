import java.util.Scanner;

public class ReadInputCasts {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int code;
        double price;
        String name;

        System.out.println("Digite o codigo:");
        code = Integer.parseInt(scan.nextLine());
        System.out.println("Digite o preço:");
        price = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o nome:");
        name = scan.nextLine();


        System.out.println("O valor digitado foi: "+ code +" -- "+ price+" -- "+ name);
        scan.close();
    }
}
