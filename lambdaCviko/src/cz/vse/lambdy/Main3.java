package cz.vse.lambdy;

import java.util.Set;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {
        Set<String> names = Set.of("Karel", "Adam", "Daniel", "Dat");
        for (String name : names) {
            if (name.startsWith("K")) {
                System.out.println(name);
            }
        }


        System.out.println("-------------------------------------");
        names.stream()
                .filter(name -> name.startsWith("K"))
                .forEach(System.out::println); // to samé jako ".forEach(name -> System.out.println(name));"

        Set<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("K"))
                .collect(Collectors.toSet());
    }


}
