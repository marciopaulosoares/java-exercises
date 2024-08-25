package lambdas;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FI_from_API {
    public static void main(String[] args) {
        FI_from_API examples = new FI_from_API();
        examples.predicate();
        examples.supplier();
        examples.consumer();
        examples.function();
        examples.unaryBinaryOperator();
        examples.methodReference();
    }

    public void predicate() {
        Predicate<String> pStr = s -> s.contains("City");
        System.out.println(pStr.test("Vatican Citry"));

        //BiPredicate<T,U> is a functional interface i.e one abstract method:
        // boolean test(T t, U u);
        BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
        System.out.println(checkLength.test("Vatican Citry", 8));
    }

    public void supplier() {
        Supplier<StringBuilder> supplier = () -> new StringBuilder();
        System.out.println("Supplier " + supplier.get().append("SK"));

        Supplier<LocalTime> supTime = () -> LocalTime.now();
        System.out.println("Supplier time " + supTime.get());
    }

    public void consumer() {
        //Consumer<T> is a functional interface i.e one abstract method:
        // void accept(T t)
        Consumer<String> printC = s -> System.out.println(s);
        printC.accept("This is an text string.");

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");

        names.forEach(printC);

        //BigConsumer<T, U> is a functional interface i.e one abstract method:
        //void accept(T t, U u)
        var mapCapitalCities = new HashMap<String, String>();
        //Note: The return value of put(k,v) is just ignored (and not returned from the lambda)
        BiConsumer<String, String> biCon = mapCapitalCities::put;
        biCon.accept("Dublin", "Ireland");
        biCon.accept("Washington D.C", "USA");

        System.out.println(mapCapitalCities); //{Dublin=Ireland, Washington D.C=USA}

        BiConsumer<String, String> mapPrint = (key, value) -> System.out.println(key + "--->" + value);
        mapCapitalCities.forEach(mapPrint);
    }

    public void function() {

        //Function<T, R> is a functional interface i.e. one abstract method:
        // R apply(T t)

        Function<String, Integer> fn2 = String::length;
        System.out.println("Function:" + fn2.apply("Moscow"));

        //Bifunctional<T,U,R> is a functional interface i.e one abstract method:
        //  R apply(T t, U u)
        BiFunction<String, String, Integer> biFn = (s1, s2) -> s1.length() + s2.length();
        System.out.println("BiFunction" + biFn.apply("Willian ", "Shakespeare"));

        BiFunction<String, String, String> biFn2 = (s1, s2) -> s1.concat(s2);
        System.out.println("BiFunction" + biFn2.apply("Willian ", "Shakespeare"));

    }

    public void unaryBinaryOperator() {
        // UnaryOperator<T> extends Function<T, T> is a functional interface i.e. one abstract method:
        // T apply(T t)
        UnaryOperator<String> unaryOp = name -> "My name is " + name;
        System.out.println("Unary operator :" + unaryOp.apply("Marcio"));

        BinaryOperator<String> binaryOp = (s1, s2) -> s1.concat(s2);
        System.out.println("Binary operator" + binaryOp.apply("Marcio ", "Paulo"));

    }

    public void methodReference() {
        List<String> names = Arrays.asList("Marcio", "Danilo", "Alex");
        names.forEach(name -> System.out.println(name)); //lambda
        names.forEach(System.out::println); // method reference
    }
}
