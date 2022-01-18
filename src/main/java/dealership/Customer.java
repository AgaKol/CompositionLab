package dealership;

import behaviour.ITransact;

import java.util.ArrayList;

public class Customer implements ITransact {

    private int wallet;
    private ArrayList<Car> cars = new ArrayList<>();

    public Customer(int wallet, ArrayList cars) {
        this.wallet = wallet;
        this.cars = cars;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void addCars(Car car){
        cars.add(car);
    }

    public void removeCars(Car car) {
        cars.remove(car);
    }

    public int carsOwned() {
        return cars.size();
    }

    @Override
    public void buyCar(Car car) {
        if (car.getPrice() <= getWallet()) {
            addCars(car);
            int currentWallet = getWallet();
            setWallet(currentWallet - car.getPrice());
        }
    }

    @Override
    public void sellCar(Car car) {
        cars.remove(car);
        int currentWallet = getWallet();
        setWallet(currentWallet + car.getPrice());
    }

    @Override
    public void repairCar(Car car) {
        if (car.getDamage() <= getWallet()) {
            int currentWallet = getWallet();
            setWallet(currentWallet - car.getDamage());
            int carPrice = car.getPrice();
            car.setPrice(carPrice + car.getDamage());
            car.setDamage(0);

        }
    }
}
