package cz.vse.zapomneni.logika;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Třída ObesitTest testuje funkčnost příkazu 'obesit'.
 *
 * @author Trong Dat Luu
 * @version LS 2021/22
 */
public class ObesitTest {

    private Hra hraTest;

    @Before
    public void setUp() {
        hraTest = new Hra();
    }

    /**
     * Metoda 'testObeseni' kontroluje, že se postava nemůže oběsit nikde jinde než v prostoru 'domov'.
     * Pokud je v prostoru 'domov', může se oběsit a příkaz ukončí hru s daným endingem.
     */
    @Test
    public void testObeseni() {
        assertEquals("domov", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi kuchyn");
        hraTest.zpracujPrikaz("obesit");
        assertFalse(hraTest.konecHry());
        hraTest.zpracujPrikaz("jdi domov");
        hraTest.zpracujPrikaz("obesit");
        assertTrue(hraTest.konecHry());
    }


}
