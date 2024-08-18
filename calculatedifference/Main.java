package calculatedifference;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  throws IOException {
        Scanner scanner = new Scanner(System.in);
        final Integer a = scanner.nextInt();
        final Integer b = scanner.nextInt();
        final Integer c = scanner.nextInt();
        final Integer d = scanner.nextInt();

        final Integer result = a * b - c * d;
        final String resultFormatted = String.format("DIFERENCA = %s",result );

        System.out.println(resultFormatted);
        scanner.close();

    }
}
