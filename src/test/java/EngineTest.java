import dealership.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine(300);
    }

    @Test
    public void canGetSize() {
        assertEquals(300, engine.getBhp(), 0.0);
    }

    @Test
    public void canSetSize() {
        engine.setBhp(400);
        assertEquals(400, engine.getBhp(), 0.0);
    }
}
