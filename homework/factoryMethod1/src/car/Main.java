package car;

import car.cars.BMW;
import car.creator.BMWService;
import car.creator.CarService;

public class Main {
    public static void main(String[] args) {
        BMWService bmwService = new BMWService();
        bmwService.newCar();
    }
}
