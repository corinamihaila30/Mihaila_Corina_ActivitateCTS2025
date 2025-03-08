package car.creator;

import car.cars.Car;

public abstract class CarService {

    public abstract Car createCar();

    public void newCar(){
        Car car = createCar();
    }
}
