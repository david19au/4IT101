package cz.vse.zapomneni.logika;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SkocitTest {

    private Hra hraTest;

    @Before
    public void setUp() {
        hraTest = new Hra();
    }

    @Test
    public void testSkocit() {
        assertEquals("domov", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        assertEquals("Nemám kde skočit odsud.", hraTest.zpracujPrikaz("skocit"));
        assertFalse(hraTest.konecHry());
        hraTest.zpracujPrikaz("jdi ulice");
        hraTest.zpracujPrikaz("jdi vaclavske_namesti");
        hraTest.zpracujPrikaz("skocit");
        assertFalse(hraTest.konecHry());
        hraTest.zpracujPrikaz("jdi karluv_most");
        hraTest.zpracujPrikaz("skocit");
        assertTrue(hraTest.konecHry());
    }
}
