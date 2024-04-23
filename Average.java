import java.io.IOException;
import java.util.Scanner;

/***
 * Read two floating points' values of double precision A and B, corresponding to two student's grades. After this, calculate the student's average, considering that grade A has weight 3.5 and B has weight 7.5. Each grade can be from zero to ten, always with one digit after the decimal point. Don’t forget to print the end of line after the result, otherwise you will receive “Presentation Error”. Don’t forget the space before and after the equal sign.
  
 */

public class Average {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc1 = new Scanner(System.in);
        float value_a = sc1.nextFloat();
        float value_b = sc1.nextFloat();

        float weight_a = 3.5f;
        float weight_b = 7.5f;


        float result = (value_a * weight_a + value_b * weight_b) / (weight_a + weight_b);

        double roundedAverage = Math.round(result * Math.pow(10, 5)) / Math.pow(10, 5);

        System.out.printf("MEDIA = %.5f\n", roundedAverage);
        sc1.close();
 
    }
 
}