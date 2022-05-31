package cz.vse.zapomneninepovedene.uiText;


import java.io.*;
import java.util.Scanner;

import cz.vse.zapomneninepovedene.logika.IHra;

/**
 *  Class TextoveRozhrani
 * 
 *  Toto je uživatelského rozhraní aplikace Adventura
 *  Tato třída vytváří instanci třídy Hra, která představuje logiku aplikace.
 *  Čte vstup zadaný uživatelem a předává tento řetězec logice a vypisuje odpověď logiky na konzoli.
 *  
 *  
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova
 *@version    pro školní rok 2016/2017
 */

public class TextoveRozhrani {
    private IHra hra;

    /**
     *  Vytváří hru.
     */
    public TextoveRozhrani(IHra hra) {
        this.hra = hra;
    }

    /**
     *  Hlavní metoda hry. Vypíše úvodní text a pak opakuje čtení a zpracování
     *  příkazu od hráče do konce hry (dokud metoda konecHry() z logiky nevrátí
     *  hodnotu true). Nakonec vypíše text epilogu.
     */
    public void hraj() {
        System.out.println(hra.vratUvitani());

        // základní cyklus programu - opakovaně se čtou příkazy a poté
        // se provádějí do konce hry.

        while (!hra.konecHry()) {
            String radek = prectiString();
            System.out.println(hra.zpracujPrikaz(radek));
        }

        System.out.println(hra.vratEpilog());
    }

    /**
     *  Metoda přečte příkaz z příkazového řádku
     *
     *@return    Vrací přečtený příkaz jako instanci třídy String
     */
    private String prectiString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        return scanner.nextLine();
    }

    public void hrajZeSouboru(String soubor) {
        try (BufferedReader cteni = new BufferedReader(new FileReader(soubor)); //try with resources aby nedošlo k memory leaks - filereader přečte bity/znak v souboru - buffered reader může číst klidně celý řádek
            PrintWriter zapis = new PrintWriter(new FileWriter("vystupPredloha.txt"))) { //"append: true" připojí data do souboru vystup.txt, pokud existuje (nepřepíše celý soubor)
            System.out.println(hra.vratUvitani());
            zapis.println(hra.vratUvitani());

            String radek = cteni.readLine();
            while (radek != null && !hra.konecHry()) { //pokud řádek není null anebo pokud hra neskončila už
                System.out.println("> " + radek);
                zapis.println("> " + radek);

                String odpoved = hra.zpracujPrikaz(radek);
                System.out.println(odpoved);
                zapis.println(odpoved);

                radek = cteni.readLine();
            }

            System.out.println(hra.vratEpilog());
            zapis.println(hra.vratEpilog());



        } catch (FileNotFoundException e) {
            File file = new File(soubor);
            System.out.println("Soubor " + soubor + " nebyl nalezen!");
            System.out.println("Soubor byl hledán na adrese: " + file.getAbsolutePath());
            //e.printStackTrace();
        } catch (IOException e) { //input output exception
            e.printStackTrace();
        } finally { //finally se spustí při jakémkoliv případě / spustí se !pokaždé! po catch blocích
            System.out.println("FINALLY");
        }
    }

}
