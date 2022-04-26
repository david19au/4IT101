package cz.david19au.soubory;

import java.io.*;
import java.util.Set;

public class ZpracovaniSouboru {
    private static String BRUH = "dlouhy.log";

/*    private void getData(String data){
        String den;
        String mesic;
        String rok;
        String hodina;
        String minuta;
        String ip;
        String operace;
        char[] Array = data.toCharArray();
            for (int i=0;i < data.length(); i++) {
                den = Character.toString((char) data.charAt(i));
                System.out.println(den);
            }*/



        //for (int i=0;i < Array.length(); i++) {
            //den =+ Array[i];
        //}
/*    }*/

    public void zpracovani(File soubor) {
        try (BufferedReader cteni = new BufferedReader(new FileReader(soubor));
             PrintWriter zapis = new PrintWriter(new FileWriter("výstupÚkol.txt"))) {

            String radek = cteni.readLine();
            while (radek != null) {
                getData(radek);
                System.out.println(radek);
                radek = cteni.readLine();

            }

        } catch (FileNotFoundException e) {
            File file = new File(BRUH);
            System.out.println("Soubor " + soubor + " nebyl nalezen!");
            System.out.println("Soubor byl hledán na adrese: " + file.getAbsolutePath());
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
