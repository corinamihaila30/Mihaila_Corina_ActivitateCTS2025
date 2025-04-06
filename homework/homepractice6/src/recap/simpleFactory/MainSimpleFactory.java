package recap.simpleFactory;

public class MainSimpleFactory {
    public static void main(String[] args) {
        FactoryPlata factoryPlata = new FactoryPlata();
        Plata plata = factoryPlata.getPlata(PlataEnum.PLATA_INSTANT);
        plata.descrierePlata();
    }
}