package car.creator;

import car.cars.Car;
import car.cars.Tesla;

public class TeslaService extends CarService{
    @Override
    public Car createCar() {
        return new Tesla();
    }
}
