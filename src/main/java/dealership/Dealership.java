package dealership;

import behaviour.ITransact;

import java.util.ArrayList;

public class Dealership implements ITransact {

    private int till;
    private ArrayList<Car> stock;

    public Dealership(int till, ArrayList<Car> stock) {
        this.till = till;
        this.stock = stock;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Car> stock) {
        this.stock = stock;
    }

    public void addToStock(Car car){
        stock.add(car);
    }

    public void removeFromStock(Car car) {
        stock.remove(car);
    }

    public int carsInStock() {
        return stock.size();
    }

    @Override
    public void buyCar(Car car) {
        if(getTill() > car.getPrice()) {
            addToStock(car);
            int currentTill = getTill();
            setTill(currentTill - car.getPrice());
        }
    }

    @Override
    public void sellCar(Car car) {
        removeFromStock(car);
        int currentTill = getTill();
        setTill(car.getPrice() + currentTill);
    }

    public void sellCarToCustomer(Car car, Customer customer) {
        sellCar(car);
        customer.addCars(car);
        int customerWallet = customer.getWallet();
        customer.setWallet(customerWallet - car.getPrice());

    }

    @Override
    public void repairCar(Car car) {
        if (getTill() >= car.getDamage()) {
            int currentTill = getTill();
            setTill(currentTill - car.getDamage());
            int oldPrice = car.getPrice();
            car.setPrice(oldPrice + car.getDamage());
            car.setDamage(0);
        }
    }
}
