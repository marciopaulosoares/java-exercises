package lambdas;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreams {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        double[] financialValues = {1.1, 2.2, 3.3};
        long[] longValues = {1L, 2L, 3L};

        IntStream iStream1 = Arrays.stream(numbers);
        DoubleStream dStream1 = Arrays.stream(financialValues);
        LongStream lStream1 = Arrays.stream(longValues);

        System.out.println(iStream1.count() + "," + dStream1.count() + "," + lStream1.count());

        IntStream intStream2 = IntStream.of(4, 5);
        DoubleStream dStream2 = DoubleStream.of(1.1, 4.4);
        LongStream lStream2 = LongStream.of(4L, 5L);

        System.out.println(intStream2.count() + "," + dStream2.count() + "," + lStream2.count());

        //using sum method
        IntStream intStream3 = IntStream.of(4, 5);
        System.out.println(intStream3.sum());
    }
}
