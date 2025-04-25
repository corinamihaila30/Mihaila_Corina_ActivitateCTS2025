package recap.patterns.singletonSiFactory;

import recap.patterns.singletonSiFactory.enums.FelMancareEnum;
import recap.patterns.singletonSiFactory.enums.SupeEnum;
import recap.patterns.singletonSiFactory.tipurimancare.FelDeMancare;
import recap.patterns.singletonSiFactory.tipurimancare.SupaCiuperci;
import recap.patterns.singletonSiFactory.tipurimancare.SupaLegume;

public class SupeFactory implements IFactory{
    @Override
    public FelDeMancare getFelMancare(FelMancareEnum tip, Float cantitate, Float pret) {
        SupeEnum supa = (SupeEnum) tip;
        switch (supa){
            case SUPA_LEGUME -> {
                return new SupaLegume(cantitate,pret);
            }
            case SUPA_CIUPERCI -> {
                return new SupaCiuperci(cantitate,pret);
            }
            default -> {
                return null;
            }
        }
    }
}
