package cz.vse.zapomneni.logika;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KoupitTest {

    private Hra hraTest;

    @Before
    public void setUp() {
        hraTest = new Hra();
    }

    @Test
    public void testNepovedenyNakupDrog() {
        assertEquals("domov", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi ulice");
        assertFalse(hraTest.konecHry());
        hraTest.zpracujPrikaz("jdi vaclavske_namesti");
        hraTest.zpracujPrikaz("jdi drogovy_dealer");
        assertEquals("drogovy_dealer", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("koupit");
        assertFalse(hraTest.konecHry());
        hraTest.zpracujPrikaz("jdi vaclavske_namesti");
        assertEquals("vaclavske_namesti", hraTest.getHerniPlan().getAktualniProstor().getNazev());
    }

    @Test
    public void testPovedenyNakupDrog() {
        assertEquals("domov", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi kuchyn");
        hraTest.zpracujPrikaz("seber penize");
        hraTest.zpracujPrikaz("jdi domov");
        hraTest.zpracujPrikaz("jdi ulice");
        hraTest.zpracujPrikaz("jdi vaclavske_namesti");
        hraTest.zpracujPrikaz("jdi drogovy_dealer");
        assertEquals("drogovy_dealer", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("koupit");
        assertTrue(hraTest.konecHry());
    }

}
