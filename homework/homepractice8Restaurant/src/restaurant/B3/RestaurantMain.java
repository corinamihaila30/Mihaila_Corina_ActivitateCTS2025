package restaurant.B3;

import restaurant.B3.Supe.SupeEnum;
import restaurant.B3.desert.DesertEnum;
import restaurant.B3.factories.FactoryDesert;
import restaurant.B3.factories.FactorySupe;
import restaurant.B3.factories.IFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RestaurantMain {
    public static void main(String[] args) {
        IFactory factoryDesert = new FactorySupe();
        FelDeMancare felDeMancare = factoryDesert.createFelMancare(SupeEnum.SUPA_LEGUME,200f);
        felDeMancare.descriereFelMancare();
    }
}