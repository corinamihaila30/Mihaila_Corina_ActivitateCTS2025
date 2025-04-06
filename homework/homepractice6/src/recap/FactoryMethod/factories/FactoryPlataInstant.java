package recap.FactoryMethod.factories;

import recap.FactoryMethod.Plata;
import recap.FactoryMethod.enums.EnumPlataInstant;
import recap.FactoryMethod.enums.PlataEnum;
import recap.FactoryMethod.plataInstant.PlataCash;
import recap.FactoryMethod.plataInstant.PlataPOS;


public class FactoryPlataInstant implements IFactory {

    @Override
    public Plata getPlata(PlataEnum den){
        EnumPlataInstant den1 = (EnumPlataInstant) den;
        switch (den1){
            case PLATA_CASH -> {
                return new PlataCash();
            }
            case PLATA_POS -> {
                return new PlataPOS();
            }
            case null-> {
                return null;
            }
        }
    }
}
