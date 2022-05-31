package cz.vse.zapomneninepovedene;

import cz.vse.zapomneninepovedene.logika.Hra;
import cz.vse.zapomneninepovedene.logika.IHra;
import cz.vse.zapomneninepovedene.uiText.TextoveRozhrani;

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
            ui.hrajZeSouboru(args[0]); //hrát předem dané scénário ze souboru
        }

    }
}
