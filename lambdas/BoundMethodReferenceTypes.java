package lambdas;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class BoundMethodReferenceTypes {

    public static void main(String[] args) {
        boundMethodReferences();
    }

    public static void boundMethodReferences() {
        String name = "Mr. DEVELOPER";
        //Supplier<T>
        //      T get()

        Supplier<String> lowerL = () -> name.toLowerCase();
        Supplier<String> lowerMR = name::toLowerCase;

        //No need to say wich instance to call it on - the supplier is bound to name
        System.out.println("::boundMethodReferences::");
        System.out.println(lowerL.get());
        System.out.println(lowerMR.get());

        //Predicate<T>
        // boolean test(T t)
        Predicate<String> titleL = (title) -> name.startsWith(title);
        Predicate<String> titleMR = name::startsWith;

        System.out.println(titleL.test("Mr."));
        System.out.println(titleMR.test("Ms."));
    }
}
