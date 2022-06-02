/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */
package cz.vse.zapomneni;


import cz.vse.zapomneni.logika.Hra;
import cz.vse.zapomneni.logika.IHra;
import cz.vse.zapomneni.uiText.TextoveRozhrani;

/*******************************************************************************
 * Třída Main je hlavní třídou projektu,
 * který představuje jednoduchou textovou adventuru určenou k dalším úpravám a rozšiřování
 *
 * @author Jarmila Pavlíčková, Trong Dat Luu
 * @version LS 2021/22
 */
public class Main {
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args) {

        IHra hra = new Hra();
        TextoveRozhrani ui = new TextoveRozhrani(hra);
        ui.hraj();
    }
}
