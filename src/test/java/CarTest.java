import dealership.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Engine engine;
    Engine engine2;
    Tyres tyres;
    Tyres tyres2;
    Gearbox gearbox;
    Gearbox gearbox2;
    Car car;

    @Before
    public void before() {
        engine = new Engine(300);
        engine2 = new Engine(400);
        tyres = new Tyres(30);
        tyres2 = new Tyres(50);
        gearbox = new Gearbox(4);
        gearbox2 = new Gearbox(6);
        car = new Car(CarType.ICE, engine, tyres, gearbox, 5000, "red", 0);
    }

    @Test
    public void canGetEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void canSetEngine() {
        car.setEngine(engine2);
        assertEquals(engine2, car.getEngine());
    }

    @Test
    public void canGetTyres() {
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void canSetTyres() {
        car.setTyres(tyres2);
        assertEquals(tyres2, car.getTyres());
    }

    @Test
    public void canGetGearbox() {
        assertEquals(gearbox, car.getGearbox());
    }

    @Test
    public void canSetGearbox() {
        car.setGearbox(gearbox2);
        assertEquals(gearbox2, car.getGearbox());
    }

    @Test
    public void canGetPrice() {
        assertEquals(5000, car.getPrice());
    }

    @Test
    public void canSetPrice () {
        car.setPrice(6000);
        assertEquals(6000, car.getPrice());
    }

    @Test
    public void canGetColour() {
        assertEquals("red", car.getColour());
    }

    @Test
    public void canSetColour() {
        car.setColour("green");
        assertEquals("green", car.getColour());
    }

    @Test
    public void canGetDamage() {
        assertEquals(0, car.getDamage());
    }

    @Test
    public void canSetDamage() {
        car.setDamage(200);
        assertEquals(200, car.getDamage());
    }

    @Test public void getCarType() {
        assertEquals(CarType.ICE, car.getCarType());
    }

    @Test
    public void canSetCarType() {
        car.setCarType(CarType.HYBRID);
        assertEquals(CarType.HYBRID, car.getCarType());
    }
}
