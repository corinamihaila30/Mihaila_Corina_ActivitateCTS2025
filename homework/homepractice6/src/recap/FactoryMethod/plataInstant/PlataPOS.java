package recap.FactoryMethod.plataInstant;


public class PlataPOS extends PlataInstant {
    @Override
    public void descrierePlata() {
        System.out.println("Plata a fost facuta instant folosind POS");
    }

    public PlataPOS() {
        super();
    }
}
