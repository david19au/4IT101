import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("A");
        for (String thing : set) { //for-each cyklus
            System.out.println(thing);
        }
        System.out.println("-----------------------");
        for(int i = 0; i < 10; i++) { //klasický for cyklus, první část je začátek, druhá část je kondice (dokud je "i" menší jak 10, poslední je zvětšení hodnoty "i"
            System.out.println(i);
        }
        System.out.println("-----------------------");
        int i = 0;
        int j = 9;
        for(; i < 10; i++, j--) { //for cyklus pro dvě proměnné
            System.out.println("i:" + i);
            System.out.println("j:" + j);
        }

        Random random = new Random();
        while (random.nextInt(10) != 9) { // pokud padne 9, tak ukončit
        random.nextInt(10); //bound = číslo-1 (v tomhle případě se mi generují čísla od 0 do 9, NE 10
            System.out.println("Still running");

        }

        do {
            System.out.println("do while");
        } while (random.nextInt(10) == 9);

    }



}
