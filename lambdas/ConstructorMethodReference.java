package lambdas;

import java.util.function.Supplier;

public class ConstructorMethodReference {

    public static void main(String[] args) {
        constructorMethodReferenceExample();
    }

    private static void constructorMethodReferenceExample() {
        // Supplier<T>
        //  T get()
        Supplier<StringBuilder> sbL = () -> new StringBuilder();
        Supplier<StringBuilder> sbMR = StringBuilder::new;

        StringBuilder sb1 = sbL.get();
        sb1.append("Lambda Version");
        System.out.println(sb1);

        StringBuilder sb2 = sbMR.get();
        sb2.append("Method Reference");
        System.out.println(sb2);
    }
}
