import java.util.Scanner;
public class ReadInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        int value = scan.nextInt();
        System.out.println("O valor digitado foi: "+ value);
        scan.close();
    }
}
