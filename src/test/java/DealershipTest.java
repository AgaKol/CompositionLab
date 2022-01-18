import dealership.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class
DealershipTest {

    ArrayList<Car> stock;
    ArrayList<Car> stock2;
    Engine engine;
    Tyres tyres;
    Gearbox gearbox;
    Car car;
    Car car2;
    Customer customer;
    ArrayList<Car> cars;
    Dealership dealership;

    @Before
    public void before() {
        engine = new Engine(300);
        tyres = new Tyres(30);
        gearbox = new Gearbox(4);
        car = new Car(CarType.ICE, engine, tyres, gearbox, 5000, "red", 0);
        car2 = new Car(CarType.ELECTRIC, engine, tyres, gearbox, 6000, "silver", 0);
        cars = new ArrayList<Car>();
        customer = new Customer(6000, cars);
        stock = new ArrayList<>();
        stock2 = new ArrayList<>();
        dealership = new Dealership(50000, stock);
        dealership.addToStock(car);
        dealership.addToStock(car2);
    }

    @Test
    public void canGetTill() {
        assertEquals(50000, dealership.getTill());
    }

    @Test
    public void canSetTill() {
        dealership.setTill(55000);
        assertEquals(55000, dealership.getTill());
    }

    @Test
    public void canGetStock() {
        assertEquals(stock, dealership.getStock());
    }

    @Test
    public void canSetStock() {
        dealership.setStock(stock2);
        assertEquals(stock2, dealership.getStock());
    }

    @Test
    public void canAddCarsToStock() {
        dealership.addToStock(car2);
        assertEquals(3, dealership.carsInStock());
    }

    @Test
    public void canRemoveCarsFromStock() {
        dealership.removeFromStock(car);
        assertEquals(1, dealership.carsInStock());
    }

    @Test
    public void canGetNumberOfCarsInStock() {
        assertEquals(2, dealership.carsInStock());
    }

    @Test
    public void canBuyCar() {
        dealership.buyCar(car);
        assertEquals(3, dealership.carsInStock());
    }

    @Test
    public void canSellCar() {
        dealership.sellCar(car);
        assertEquals(1, dealership.carsInStock());
    }

    @Test
    public void canSellCarToCustomer() {
        dealership.sellCarToCustomer(car, customer);
        assertEquals(1, dealership.carsInStock());
    }

    @Test
    public void canRepairCar() {
        car.setDamage(10000);
        dealership.repairCar(car);
        assertEquals(40000, dealership.getTill());
    }
}
