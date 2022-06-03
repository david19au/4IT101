package cz.vse.zapomneni.logika;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tato třída BodnoutTest testuje příkaz 'bodnout' ze hry.
 *
 * @author Trong Dat Luu
 * @version LS 2021/22
 */

public class BodnoutTest {

    private Hra hraTest;

    @Before
    public void setUp() {
        hraTest = new Hra();
    }

    /**
     * Test kontroluje, zda se hra neukončí jen tak bezdůvodně a také to, že se postava nemůže bodnout bez sebrání nože.
     */
    @Test
    public void testBodnuti() {
        assertEquals("domov", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi kuchyn");
        assertFalse(hraTest.konecHry());
        assertEquals("kuchyn", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("bodnout");
        assertFalse(hraTest.konecHry());
        hraTest.zpracujPrikaz("seber nuz");
        hraTest.zpracujPrikaz("bodnout");
        assertTrue(hraTest.konecHry());
    }
}
