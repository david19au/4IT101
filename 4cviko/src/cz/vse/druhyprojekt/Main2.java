package cz.vse.druhyprojekt;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<Human> set = new HashSet<>();
        System.out.println(set.add(new Human("Roman",12)));
        System.out.println(set.add(new Human("Karel",18)));
        System.out.println(set);
    }
}
