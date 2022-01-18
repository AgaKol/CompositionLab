import dealership.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {
    Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres(30);
    }

    @Test
    public void canGetTyres() {
        assertEquals(30, tyres.getSize());
    }

    @Test
    public void canSetTyres() {
        tyres.setSize(40);
        assertEquals(40, tyres.getSize());
    }
}
