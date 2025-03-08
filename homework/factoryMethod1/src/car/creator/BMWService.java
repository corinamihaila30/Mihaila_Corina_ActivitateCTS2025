package car.creator;

import car.cars.BMW;
import car.cars.Car;

public class BMWService extends CarService{
    @Override
    public Car createCar() {
        return new BMW();
    }
}
