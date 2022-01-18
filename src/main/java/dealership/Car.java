package dealership;

public class Car {
    private CarType carType;
    private Engine engine;
    private Tyres tyres;
    private Gearbox gearbox;
    private int price;
    private String colour;
    private int damage;

    public Car(CarType carType, Engine engine, Tyres tyres, Gearbox gearbox, int price, String colour, int damage) {
        this.carType = carType;
        this.engine = engine;
        this.tyres = tyres;
        this.gearbox = gearbox;
        this.price = price;
        this.colour = colour;
        this.damage = damage;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}


