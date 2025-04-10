package restaurant.B3.factories;

import restaurant.B3.FelDeMancare;
import restaurant.B3.IFelMancare;
import restaurant.B3.desert.CheeseCake;
import restaurant.B3.desert.Clatite;
import restaurant.B3.desert.DesertEnum;
import restaurant.B3.desert.Papanasi;

public class FactoryDesert implements IFactory{
    @Override
    public FelDeMancare createFelMancare(IFelMancare felMancare,Float cantitate) {
        DesertEnum desert = (DesertEnum) felMancare;
        switch (desert){
            case CHEESECAKE -> {
                return new CheeseCake(cantitate);
            }
            case CLATITE -> {
                return new Clatite(cantitate);
            }
            case PAPANASI -> {
                return new Papanasi(cantitate);
            }
            default -> {
                return null;
            }
        }
    }
}
