package recap.FactoryMethod.factories;

import recap.FactoryMethod.Plata;
import recap.FactoryMethod.PlataUlterior.PlataRate;
import recap.FactoryMethod.PlataUlterior.PlataTransferBancar;
import recap.FactoryMethod.enums.EnumPlataUlterior;
import recap.FactoryMethod.enums.PlataEnum;

public class FactoryPlataUlterior implements IFactory {

    @Override
    public Plata getPlata(PlataEnum den){
        EnumPlataUlterior den1 = (EnumPlataUlterior) den;
        switch (den1){
            case PLATA_RATE -> {
                return new PlataRate();
            }
            case PLATA_TRANSFER -> {
                return new PlataTransferBancar();
            }
            case null-> {
                return null;
            }
        }
    }
}
