package cz.vse.zapomneni;

import cz.vse.zapomneni.logika.Hra;
import cz.vse.zapomneni.logika.IHra;
import cz.vse.zapomneni.uiText.TextoveRozhrani;

/*******************************************************************************
 * Třída  Start je hlavní třídou projektu,
 * který představuje jednoduchou textovou adventuru určenou k dalším úpravám a rozšiřování
 *
 * @author    Jarmila Pavlíčková, Trong Dat Luu
 * @version   1.0
 */
public class Main
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {

        IHra hra = new Hra();
        TextoveRozhrani ui = new TextoveRozhrani(hra);

        if(args.length == 0) {
            ui.hraj();
        } else {
            ui.hrajZeSouboru(args[0]);
        }

    }
}
