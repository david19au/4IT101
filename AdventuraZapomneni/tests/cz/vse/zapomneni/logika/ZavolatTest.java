package cz.vse.zapomneni.logika;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZavolatTest {

    private Hra hraTest;

    @Before
    public void setUp() {
        hraTest = new Hra();
    }

    @Test
    public void testZavolatRodicum() {
        assertEquals("domov", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi kuchyn");
        assertEquals("Nemohu zde volat.", hraTest.zpracujPrikaz("zavolat"));
        hraTest.zpracujPrikaz("jdi domov");
        assertEquals("Postava zavolala svým rodičům a nebyla to příjemná povídaná.\nRodiče nezajímaly problémy postavy a vinu shazovaly na postavu, že si neumí správně zařídit čas.\nPostava se nyní cítí ještě více bezcenná, než předtím.", hraTest.zpracujPrikaz("zavolat"));
    }

}
