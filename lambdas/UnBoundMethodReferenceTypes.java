package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class UnBoundMethodReferenceTypes {
    public static void main(String[] args) {
        unboundMethodReferences();
    }

    public static void unboundMethodReferences() {
        // Function<T, R>
        //   R apply (T)
        //      String apply (String)
        Function<String, String> upperL = s -> s.toUpperCase();
        Function<String, String> upplerMR = String::toUpperCase;

        // The function is unbound, so you need to specify which instance to call it on

        System.out.println(upperL.apply("testando unbound method"));
        System.out.println(upplerMR.apply("testando unbound method"));

        // Function<T, U, R>
        //  R apply (T t, U u)
        //      String apply(String, String)
        BiFunction<String, String, String> concatL = (s1, s2) -> s1.concat(s2);
        BiFunction<String, String, String> concatMR = String::concat;

        System.out.println(concatL.apply("Marcio ", "Paulo"));

        // 1st parameter is used for excuting the instance method
        // "Marcio".concat("Paulo")
        System.out.println(concatMR.apply("Marcio ", "Paulo"));

    }
}
