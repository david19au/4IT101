package cz.vse.zapomneni.logika;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BodnoutTest {

    private Hra hraTest;

    @Before
    public void setUp() {
        hraTest = new Hra();
    }

    @Test
    public void testBodnuti() {
        assertEquals("domov", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi kuchyn");
        assertEquals(false, hraTest.konecHry());
        assertEquals("kuchyn", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("bodnout");
        assertEquals(false, hraTest.konecHry());
        hraTest.zpracujPrikaz("seber nuz");
        hraTest.zpracujPrikaz("bodnout");
        assertEquals(true, hraTest.konecHry());
    }
}
