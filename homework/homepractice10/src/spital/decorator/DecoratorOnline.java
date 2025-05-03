package spital.decorator;

public class DecoratorOnline extends AbstractDecorator{


    public DecoratorOnline(Rezultat r) {
        super(r);
    }


    @Override
    public void printareRezultat() {
        r.printareRezultat();
        additionalMethod();
    }

    public void additionalMethod() {
        System.out.println("Mai afisez ceva");
    }
}
