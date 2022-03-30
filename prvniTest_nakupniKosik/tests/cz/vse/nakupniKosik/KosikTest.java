/**
 * @author Trong Dat Luu @david19au
 * @version 1.0
 */

package cz.vse.nakupniKosik;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KosikTest {

    @Test
    public void pridatVecTest() {
        Kosik kosik = new Kosik();
        Vec vec1 = new Vec(85, 99, "WC Bref");
        Vec vec2 = new Vec(20, 20, "Donut");
        Vec vec3 = new Vec(32, 50, "Chlazené kuře");

        assertTrue(kosik.pridejVec(vec1));
        assertTrue(kosik.pridejVec(vec2));
        assertTrue(kosik.pridejVec(vec3));

        assertFalse(kosik.pridejVec(vec1));
        assertFalse(kosik.pridejVec(vec2));
        assertFalse(kosik.pridejVec(vec3));

        assertEquals(3, kosik.seznamVeciVKosiku.size());

    }

    @Test
    public void odebratVecTest() {
        Kosik kosik = new Kosik();
        Vec vec1 = new Vec(85, 99, "WC Bref");
        Vec vec2 = new Vec(20, 20, "Donut");
        Vec vec3 = new Vec(32, 50, "Chlazené kuře");

        assertTrue(kosik.pridejVec(vec1));
        assertTrue(kosik.pridejVec(vec2));
        assertTrue(kosik.pridejVec(vec3));

        assertEquals(vec1, kosik.odeberVec(85));

        assertEquals(2, kosik.seznamVeciVKosiku.size());
        assertNull(kosik.odeberVec(3));

    }

    @Test
    public void seznamVeciTest() {
        Kosik kosik = new Kosik();
        Vec vec1 = new Vec(85, 99, "WC Bref");
        Vec vec2 = new Vec(20, 20, "Donut");
        Vec vec3 = new Vec(32, 50, "Chlazené kuře");
        Vec vec4 = new Vec(2, 15, "Žvýkačky");
        Vec vec5 = new Vec(1, 30, "Čokoláda");

        assertTrue(kosik.pridejVec(vec1));
        assertTrue(kosik.pridejVec(vec2));
        assertTrue(kosik.pridejVec(vec3));

        assertEquals(3, kosik.seznamVeci().size());
    }

    @Test
    public void seznamVeciSCenouOdDoTest() {
        Kosik kosik = new Kosik();
        Vec vec1 = new Vec(85, 99, "WC Bref");
        Vec vec2 = new Vec(20, 20, "Donut");
        Vec vec3 = new Vec(32, 50, "Chlazené kuře");
        Vec vec4 = new Vec(2, 15, "Žvýkačky");
        Vec vec5 = new Vec(1, 30, "Čokoláda");

        assertTrue(kosik.pridejVec(vec1));
        assertTrue(kosik.pridejVec(vec2));
        assertTrue(kosik.pridejVec(vec3));
        assertTrue(kosik.pridejVec(vec4));
        assertTrue(kosik.pridejVec(vec5));

        assertEquals(3, kosik.seznamVeciSCenouOdDo(0, 30).size());
        assertEquals(5, kosik.seznamVeciSCenouOdDo(0, 100).size());
    }
}
