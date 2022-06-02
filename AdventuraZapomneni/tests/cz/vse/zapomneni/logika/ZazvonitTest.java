package cz.vse.zapomneni.logika;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZazvonitTest {

    private Hra hraTest;

    @Before
    public void setUp() {
        hraTest = new Hra();
    }

    @Test
    public void testZazvoneni() {
        assertEquals("domov", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        assertEquals("Postava nemá kde zazvonit.", hraTest.zpracujPrikaz("zazvonit"));
        assertFalse(hraTest.konecHry());
        hraTest.zpracujPrikaz("jdi ulice");
        hraTest.zpracujPrikaz("jdi kamaraduv_byt");
        hraTest.zpracujPrikaz("zazvonit");
        assertTrue(hraTest.konecHry());

    }
}
