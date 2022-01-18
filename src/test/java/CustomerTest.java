import dealership.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Engine engine;
    Tyres tyres;
    Gearbox gearbox;
    Car car;
    Car car2;
    Customer customer;
    ArrayList<Car> cars;
    ArrayList<Car> cars2;

    @Before
    public void before() {
        engine = new Engine(300);
        tyres = new Tyres(30);
        gearbox = new Gearbox(4);
        car = new Car(CarType.ICE, engine, tyres, gearbox, 5000, "red", 0);
        car2 = new Car(CarType.ELECTRIC, engine, tyres, gearbox, 6000, "silver", 0);
        cars = new ArrayList<Car>();
        cars2 = new ArrayList<>();
        customer = new Customer(6000, cars);
        customer.addCars(car);
    }

    @Test
    public void canGetWallet() {
        assertEquals(6000, customer.getWallet());
    }

    @Test
    public void canSetWallet() {
        customer.setWallet(7000);
        assertEquals(7000, customer.getWallet());
    }

    @Test
    public void canGetCars() {
        assertEquals(cars, customer.getCars());
    }

    @Test
    public void canSetCarsOwned() {
        customer.setCars(cars2);
        assertEquals(cars2, customer.getCars());
    }

    @Test
    public void canAddCar() {
        customer.addCars(car2);
        assertEquals(2, customer.carsOwned());
    }

    @Test
    public void canRemoveCars() {
        customer.removeCars(car);
        assertEquals(0, customer.carsOwned());
    }

    @Test
    public void canGetCarsOwned() {
        assertEquals(1, customer.carsOwned());
    }

    @Test
    public void canBuyCar() {
        customer.buyCar(car2);
        assertEquals(2, customer.carsOwned());
    }

    @Test
    public void canSellCar() {
        customer.sellCar(car);
        assertEquals(0, customer.carsOwned());
    }

    @Test
    public void canRepairCar() {
        car.setDamage(1000);
        customer.repairCar(car);
        assertEquals(5000, customer.getWallet());
        assertEquals(0, car.getDamage());
    }
}
