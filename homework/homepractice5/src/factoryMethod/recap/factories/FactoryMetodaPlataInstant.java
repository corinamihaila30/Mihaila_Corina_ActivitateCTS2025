package factoryMethod.recap.factories;

import factoryMethod.recap.MetodaPlata;
import factoryMethod.recap.PlataInstant;
import factoryMethod.recap.enums.EnumInterface;
import factoryMethod.recap.enums.EnumPlataInstant;
import factoryMethod.recap.metodeInstant.PlataCash;
import factoryMethod.recap.metodeInstant.PlataPOS;

public class FactoryMetodaPlataInstant extends Factoy {

    @Override
    public MetodaPlata getMetodaDePlata(EnumInterface type) {
        return switch (type){
            case EnumPlataInstant.CASH -> new PlataCash();
            case EnumPlataInstant.POS -> new PlataPOS();
            default ->  null;
        };
    }
}
