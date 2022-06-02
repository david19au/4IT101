package cz.vse.zapomneni.logika;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(false, hraTest.konecHry());
        hraTest.zpracujPrikaz("jdi ulice");
        hraTest.zpracujPrikaz("jdi kamaraduv_byt");
        hraTest.zpracujPrikaz("zazvonit");
        assertEquals(true, hraTest.konecHry());

    }
}
