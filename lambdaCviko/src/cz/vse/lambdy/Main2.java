package cz.vse.lambdy;

import java.awt.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {
        Function<String, Integer> function =  text -> Integer.parseInt(text); //jednořádkový zápis konverze Stringu na Int
        Function<String, Integer> functionReference = Integer::parseInt; //ještě zkrácený jednořádkový zápis konverze Stringu na Int pomocí method reference

        System.out.println(function.apply("123"));
        System.out.println(functionReference.apply("456"));


        System.out.println("---------------------------");

        Consumer<String> consumer = Main2::pomocnaMetoda;
        consumer.accept("ahoj");

    }
    public static void pomocnaMetoda(String text) {
        System.out.println(text);
    }
}
