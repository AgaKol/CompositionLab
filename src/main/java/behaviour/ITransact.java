package behaviour;

import dealership.Car;

public interface ITransact {

    public void buyCar(Car car);
    public void sellCar(Car car);
    public void repairCar(Car car);
}
