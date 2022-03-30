import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MistnostTest {

    @Test
    public void testVlozVec() {
        Mistnost mistnost = new Mistnost();
        Vec vec1 = new Vec("Keys", true);
        Vec vec2 = new Vec("AirTag",false);

        assertTrue(mistnost.vlozVec(vec1));
        assertFalse(mistnost.vlozVec(vec1));
    }

    @Test
    public void testOdeberVec() {
        Mistnost mistnost = new Mistnost();
        Vec vec1 = new Vec("Keys", true);
        Vec vec2 = new Vec("AirTag",false);
        mistnost.vlozVec(vec1);
        mistnost.vlozVec(vec2);

        assertEquals(vec1, mistnost.odeberVec("Keys"));
        assertNull(mistnost.odeberVec("Webcam"));
    }

    @Test
    public void testSebratelnostVeci() {
        Mistnost mistnost = new Mistnost();
        Vec vec1 = new Vec("Keys", true);
        Vec vec2 = new Vec("AirTag",false);
        Vec vec3 = new Vec("Webcam",true);
        mistnost.vlozVec(vec1);
        mistnost.vlozVec(vec2);
        mistnost.vlozVec(vec3);
        assertEquals(2, mistnost.sebratelneVeci().size());
    }

}
