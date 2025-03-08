package car.cars;

public class BMW implements Car {
    @Override
    public void startEngine() {
        System.out.println("Engine BMW started");
    }

    @Override
    public void personalize() {
        System.out.println("BMW was personalised");
    }
}
