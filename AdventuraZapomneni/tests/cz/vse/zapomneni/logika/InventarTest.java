package cz.vse.zapomneni.logika;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventarTest {

    private Inventar inventarTest;
    private Vec vecTest1;
    private Vec vecTest2;
    private Vec vecTest3;

    @Before
    public void setUp() {
        inventarTest = new Inventar();
        vecTest1 = new Vec("Vec1", true);
        vecTest2 = new Vec("Vec2", true);
        vecTest3 = new Vec("Vec3", true);
    }

    @Test
    public void testInventar() {
        inventarTest.vlozeniVeciDoInv(vecTest1);
        assertEquals(1, inventarTest.getPocetVeci());
        assertEquals(true, inventarTest.obsahujeVInventari("Vec1"));
        inventarTest.vlozeniVeciDoInv(vecTest2);
        assertEquals(2, inventarTest.getPocetVeci());
        assertEquals(true, inventarTest.obsahujeVInventari("Vec1"));
        assertEquals(true, inventarTest.obsahujeVInventari("Vec2"));
        inventarTest.vlozeniVeciDoInv(vecTest3);
        assertEquals(2, inventarTest.getPocetVeci());
        assertEquals(true, inventarTest.obsahujeVInventari("Vec1"));
        assertEquals(true, inventarTest.obsahujeVInventari("Vec2"));
        assertEquals(false, inventarTest.obsahujeVInventari("Vec3"));
        inventarTest.odebraniVeciZInv(vecTest2);
        assertEquals(1, inventarTest.getPocetVeci());
        inventarTest.vlozeniVeciDoInv(vecTest3);
        assertEquals(2, inventarTest.getPocetVeci());
        assertEquals(true, inventarTest.obsahujeVInventari("Vec3"));
        assertEquals(false, inventarTest.obsahujeVInventari("Vec2"));
        assertEquals(true, inventarTest.obsahujeVInventari("Vec1"));


    }
}
