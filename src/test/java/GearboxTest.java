import dealership.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearboxTest {
    Gearbox gearbox;

    @Before
    public void before() {
        gearbox = new Gearbox(4);
    }

    @Test
    public void canGetNumberOfGears() {
        assertEquals(4, gearbox.getNumberOfGears());
    }


    @Test
    public void canSetNumberOfGears() {
        gearbox.setNumberOfGears(5);
        assertEquals(5, gearbox.getNumberOfGears());
    }
}
