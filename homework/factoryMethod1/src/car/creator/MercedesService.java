package car.creator;

import car.cars.Car;
import car.cars.Mercedes;

public class MercedesService extends CarService{
    @Override
    public Car createCar() {
        return new Mercedes();
    }
}
