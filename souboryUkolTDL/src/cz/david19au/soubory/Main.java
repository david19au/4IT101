package cz.david19au.soubory;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File soubor = new File(args[0]);

        if(args.length != 1);
            System.out.println("Bylo zadáno více argumentů, zadejte prosím POUZE 1 cestu k 1 souboru.");

            if(!soubor.exists())
                System.out.println("Zadaná cesta je špatná, nebo soubor neexistuje.");
            if(soubor.isDirectory())
                System.out.println("Toto je složka, ne soubor.");

            ZpracovaniSouboru.zpracovani(soubor);
    }
}

