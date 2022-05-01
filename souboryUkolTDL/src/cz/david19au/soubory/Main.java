package cz.david19au.soubory;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 1) {
            System.out.println("Bylo zadáno více argumentů nebo nebyl zadán žádný, zadejte prosím pouze 1 argument.");
            System.exit(1);
        }

        File soubor = new File(args[0]);

        if (!soubor.exists()) {
            System.out.println("Zadaná cesta je špatná, neexistující, nebo soubor neexistuje.");
            System.exit(1);
        }
        if (soubor.isDirectory()) {
            System.out.println("Toto je složka, ne soubor.");
            System.exit(1);
        }

        ZpracovaniSouboru.zpracovani(soubor);
    }
}

