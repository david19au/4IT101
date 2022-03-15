package cz.vse.druhyprojekt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //klasické pole
        list.add("Bruh 1"); //0
        list.add("Bruh 1"); //1
        list.add("Bruh 2"); //2
        list.add("Bruh 3"); //3
        list.add("Bruh 4"); //4
        list.add("Bruh 5"); //5

        for (String Bruh : list) {
            System.out.println("ForEach: " + Bruh);
        }

//        String[] field = new String[]{"Bruh 1", "Bruh 2"}; // můžu přidat hned věci do pole a vytvoří se mi o n-velikosti
        String[] field = new String[5]; // hranaté závorky vyznačují pole, uvnitř těch závorek dávám počet hodnot uvnitř
        field[2] = "lmao 1";
        field[2] = null; // vrácení do defaultního stavu
        int fieldLength = field.length;
        field[fieldLength-1] = "lmao 1"; //přídám do posledního místa v poli hodnotu


    }
}

//
//        System.out.println("The list currently has: " + list.size() + " entries.");
//
//        list.remove(1);
//        System.out.println("The list currently has: " + list.size() + " entries after index removal (i).");
//
//        list.remove("Bruh 3");
//        System.out.println("The list currently has: " + list.size() + " entries after object removal (o).");
//
//        System.out.println(list.get(0));
//
//        System.out.println("List contains \"Bruh 1\": " + list.contains("Bruh 1"));
//        System.out.println("List contains \"Bruh 2\": " + list.contains("Bruh 2"));
//
//        System.out.println("8========================================================D");
//
//        Set<String> set = new HashSet<>(); //v "set" nejsou nikdy duplicitní hodnoty a nemá pořadí, jde jenom o hodnoty
//        set.add("Bruh 1");
//        set.add("Bruh 2");
//        set.add("Bruh 3");
//        set.add("Bruh 4");
//        set.add("Bruh 5");
//
//        System.out.println("In this set, there are currently: " + set.size() + " entries.");
//
//
//        set.remove("Bruh 3");
//        System.out.println("In this set, there are currently: " + set.size() + " entries after deletion of \"Bruh 3\".");
//
//        System.out.println("Set contains \"Bruh 7\": " + set.contains("Bruh 7"));
//        System.out.println("Set contains \"Bruh 1\": " + set.contains("Bruh 1"));
//
//        System.out.println("=======================");
//
//        Set<Human> setOfHumans = new HashSet<>();
//        setOfHumans.add(new Human("Karel", 10));
//        setOfHumans.add(new Human("Jana", 10));
//        setOfHumans.add(new Human("Jana", 10)); //tenhle záznam nebude platit, protože v setu jsou jen UNIKÁTNÍ položky
//
//        System.out.println("In this set, there are: " + setOfHumans.size() + " people.");
//    }
//}
