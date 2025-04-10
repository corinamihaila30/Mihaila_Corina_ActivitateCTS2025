package restaurant.B3.factories;

import restaurant.B3.FelDeMancare;
import restaurant.B3.IFelMancare;

public interface IFactory {
    FelDeMancare createFelMancare(IFelMancare felMancare,Float cantitate);
}
