package restaurant.B3.factories;

import restaurant.B3.FelDeMancare;
import restaurant.B3.IFelMancare;
import restaurant.B3.Supe.SupaCiuperci;
import restaurant.B3.Supe.SupaLegume;
import restaurant.B3.Supe.SupaVita;
import restaurant.B3.Supe.SupeEnum;

public class FactorySupe implements IFactory{
    @Override
    public FelDeMancare createFelMancare(IFelMancare felMancare,Float cantitate) {
        SupeEnum supa = (SupeEnum) felMancare;
        switch (supa) {
            case SUPA_CIUPERCI -> {
                return new SupaCiuperci(cantitate);
            }
            case SUPA_LEGUME -> {
                return new SupaLegume(cantitate);
            }
            case SUPA_VITA -> {
                return new SupaVita(cantitate);
            }
            default -> {
                return null;
            }


        }
    }}