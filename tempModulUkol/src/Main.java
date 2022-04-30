import java.io.File;

public class Main {

    public static void main(String[] args) throws  Exception {
        if(args.length != 1)
            throw new Exception("Bylo zadáno více argumentů, zadejte prosím pouze 1 argument.");

        File soubor = new File(args[0]);

        if(!soubor.exists())
            throw new Exception("Zadaná cesta je špatná, neexistující, nebo soubor neexistuje.");
        if(soubor.isDirectory())
            throw new Exception("Toto je složka, ne soubor.");

        ZpracovaniSouboru.zpracovani(soubor);
    }
}
