package factoryMethod.recap.factories;

import factoryMethod.recap.MetodaPlata;
import factoryMethod.recap.enums.EnumInterface;

public abstract class Factoy {
    abstract MetodaPlata getMetodaDePlata(EnumInterface type);
}
