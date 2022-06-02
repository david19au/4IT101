package cz.vse.zapomneni.logika;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObesitTest {

    private Hra hraTest;

    @Before
    public void setUp() {
        hraTest = new Hra();
    }

    @Test
    public void testObeseni() {
        assertEquals("domov", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi kuchyn");
        hraTest.zpracujPrikaz("obesit");
        assertEquals(false, hraTest.konecHry());
        hraTest.zpracujPrikaz("jdi domov");
        hraTest.zpracujPrikaz("obesit");
        assertEquals(true, hraTest.konecHry());
    }


}
