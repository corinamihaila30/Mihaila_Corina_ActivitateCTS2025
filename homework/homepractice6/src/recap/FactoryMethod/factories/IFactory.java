package recap.FactoryMethod.factories;

import recap.FactoryMethod.Plata;
import recap.FactoryMethod.enums.PlataEnum;

public interface IFactory {

    Plata getPlata(PlataEnum den);
}
