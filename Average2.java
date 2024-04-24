import java.io.IOException;
import java.util.Scanner;

/***
Read three values (variables A, B and C), 
which are the three student's grades. 
Then, calculate the average, considering that grade A has weight 2, 
grade B has weight 3 and the grade C has weight 5. 
Consider that each grade can go from 0 to 10.0, always with one decimal place.
 */

public class Average2 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc1 = new Scanner(System.in);
        float value_a = sc1.nextFloat();
        float value_b = sc1.nextFloat();
        float value_c = sc1.nextFloat();

        float weight_a = 2f;
        float weight_b = 3f;
        float weight_c = 5f;

        float result = (value_a * weight_a + value_b * weight_b + value_c * weight_c) / (weight_a + weight_b + weight_c);

        System.out.printf("MEDIA = %.1f\n", result);
        sc1.close();
 
    }
 
}