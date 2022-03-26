package cz.vse.druhyprojekt;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<Human> set = new HashSet<>();
        System.out.println(set.add(new Human("Karel", 18)));
        System.out.println(set);
        System.out.println("--------------------");
        System.out.println(set.add(new Human("Karel", 18)));
        System.out.println(set);
        System.out.println("--------------------");
        System.out.println(set.add(new Human("Pepa", 20)));
        System.out.println(set);
        // ve "false" jsou věci které se nezapsaly - v tomhle případě je to kvůli duplicitě Karla
    }
}
