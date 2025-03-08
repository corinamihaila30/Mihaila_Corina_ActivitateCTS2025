package car.cars;

public class Tesla implements Car {
    @Override
    public void startEngine() {
        System.out.println("Engine Tesla started");
    }

    @Override
    public void personalize() {
        System.out.println("Tesla was personalised");
    }
}
