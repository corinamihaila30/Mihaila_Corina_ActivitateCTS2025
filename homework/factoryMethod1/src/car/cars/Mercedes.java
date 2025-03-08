package car.cars;

public class Mercedes implements Car {
    @Override
    public void startEngine() {
        System.out.println("Mercedes engine started ");
    }

    @Override
    public void personalize() {
        System.out.println("Mercedes was personalised");
    }
}
