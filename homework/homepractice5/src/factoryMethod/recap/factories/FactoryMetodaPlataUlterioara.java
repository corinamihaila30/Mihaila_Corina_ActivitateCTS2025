package factoryMethod.recap.factories;

import factoryMethod.recap.MetodaPlata;
import factoryMethod.recap.enums.EnumInterface;
import factoryMethod.recap.enums.EnumPlataUlterioara;
import factoryMethod.recap.plataUlterior.PlataDepozit;
import factoryMethod.recap.plataUlterior.PlataRate;

public class FactoryMetodaPlataUlterioara extends Factoy {
    @Override
    public MetodaPlata getMetodaDePlata(EnumInterface type) {
        return switch (type){
            case EnumPlataUlterioara.Depozit -> new PlataDepozit();
            case EnumPlataUlterioara.Rate -> new PlataRate();
            default -> null;
        };
    }
}
