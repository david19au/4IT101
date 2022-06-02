package cz.vse.zapomneni.logika;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*******************************************************************************
 * Testovací třída HraTest slouží ke komplexnímu otestování
 * třídy Hra
 *
 * @author Jarmila Pavlíčková
 * @version pro školní rok 2016/2017
 */
public class HraTest {
    private Hra hraTest;
    private Inventar inventarTest;

    //== Datové atributy (statické i instancí)======================================

    //== Konstruktory a tovární metody =============================================
    //-- Testovací třída vystačí s prázdným implicitním konstruktorem ----------

    //== Příprava a úklid přípravku ================================================

    /***************************************************************************
     * Metoda se provede před spuštěním každé testovací metody. Používá se
     * k vytvoření tzv. přípravku (fixture), což jsou datové atributy (objekty),
     * s nimiž budou testovací metody pracovat.
     */
    @Before
    public void setUp() {
        hraTest = new Hra();
        inventarTest = new Inventar();
    }

    /***************************************************************************
     * Úklid po testu - tato metoda se spustí po vykonání každé testovací metody.
     */
    @After
    public void tearDown() {
    }

    //== Soukromé metody používané v testovacích metodách ==========================

    //== Vlastní testovací metody ==================================================

    /***************************************************************************
     * Testuje průběh hry, po zavolání každého příkazu testuje, zda hra končí
     * a v jaké aktuální místnosti se hráč nachází.
     * Při dalším rozšiřování hry doporučujeme testovat i jaké věci nebo osoby
     * jsou v místnosti a jaké věci jsou v batohu hráče.
     *
     */
    @Test
    public void testProchazeniProstoru() {
        assertEquals("domov", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi kuchyn");
        assertEquals(false, hraTest.konecHry());
        assertEquals("kuchyn", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi domov");
        assertEquals(false, hraTest.konecHry());
        assertEquals("domov", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi ulice");
        assertEquals(false, hraTest.konecHry());
        assertEquals("ulice", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi kamaraduv_byt");
        assertEquals(false, hraTest.konecHry());
        assertEquals("kamaraduv_byt", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi ulice");
        assertEquals(false, hraTest.konecHry());
        assertEquals("ulice", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi vaclavske_namesti");
        assertEquals(false, hraTest.konecHry());
        assertEquals("vaclavske_namesti", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi drogovy_dealer");
        assertEquals(false, hraTest.konecHry());
        assertEquals("drogovy_dealer", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi vaclavske_namesti");
        assertEquals(false, hraTest.konecHry());
        assertEquals("vaclavske_namesti", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi karluv_most");
        assertEquals(false, hraTest.konecHry());
        assertEquals("karluv_most", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi vaclavske_namesti");
        assertEquals(false, hraTest.konecHry());
        assertEquals("vaclavske_namesti", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi ulice");
        assertEquals(false, hraTest.konecHry());
        assertEquals("ulice", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi hlavni_nadrazi");
        assertEquals(false, hraTest.konecHry());
        assertEquals("hlavni_nadrazi", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi ulice");
        assertEquals(false, hraTest.konecHry());
        assertEquals("ulice", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi skola");
        assertEquals(false, hraTest.konecHry());
        assertEquals("skola", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("jdi strecha_skoly");
        assertEquals(false, hraTest.konecHry());
        assertEquals("strecha_skoly", hraTest.getHerniPlan().getAktualniProstor().getNazev());
        hraTest.zpracujPrikaz("konec");
        assertEquals(true, hraTest.konecHry());
    }

}
