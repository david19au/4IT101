package cz.vse.lambdy;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        TestInterface vypis = new TestInterfaceInput();
        vypis.vypis("Ahoj z interpretace");

        TestInterface lambdaVypis = text -> System.out.println(text);
        lambdaVypis.vypis("Ahoj z lambdy");

        Consumer<String> consumerVypis = text -> System.out.println(text); //papá hodnoty
        consumerVypis.accept("Ahoj z consumer");

        Supplier<Integer> supplier = () -> test(); //dává hodnoty
        System.out.println(supplier.get());

        Function<String, Integer> function = text -> {
            System.out.println("Konvertuji číslo");
            int cislo = Integer.parseInt(text);
            return cislo;
        };
        System.out.println(function.apply("123"));
        System.out.println(function.apply("456"));
    }

    public static int test() {
        return 2;
    }
}
