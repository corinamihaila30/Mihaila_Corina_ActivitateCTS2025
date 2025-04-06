package recap.FactoryMethod;

import recap.FactoryMethod.enums.EnumPlataUlterior;
import recap.FactoryMethod.factories.FactoryPlataUlterior;

public class MainSimpleFactory {
    public static void main(String[] args) {
        FactoryPlataUlterior factoryPlataUlterior = new FactoryPlataUlterior();
        Plata plata = factoryPlataUlterior.getPlata(EnumPlataUlterior.PLATA_RATE);
        plata.descrierePlata();
    }
}