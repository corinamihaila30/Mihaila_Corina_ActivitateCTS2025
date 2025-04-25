package recap.patterns.singletonSiFactory;

import recap.patterns.singletonSiFactory.enums.FelMancareEnum;
import recap.patterns.singletonSiFactory.tipurimancare.FelDeMancare;

public interface IFactory {
    FelDeMancare getFelMancare(FelMancareEnum tip,Float cantitate,Float pret);
}
