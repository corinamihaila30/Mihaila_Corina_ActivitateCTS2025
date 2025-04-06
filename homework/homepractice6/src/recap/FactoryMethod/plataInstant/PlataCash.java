package recap.FactoryMethod.plataInstant;


public class PlataCash extends PlataInstant {

    @Override
    public void descrierePlata() {
        System.out.println("Plata a fost facuta instant folosind cash");
    }

    public PlataCash() {
        super();
    }
}
