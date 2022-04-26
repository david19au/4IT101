package cz.david19au.soubory;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ZpracovaniSouboru zpracovaniSouboru = new ZpracovaniSouboru();

        if(args.length == 0) {
            System.out.println("V parametrech chybí soubor.");
        } else {
            File file = new File(args[0]);
            zpracovaniSouboru.zpracovani(file);
        }
    }

}
