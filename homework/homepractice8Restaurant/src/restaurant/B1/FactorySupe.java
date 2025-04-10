package restaurant.B1;

public class FactorySupe {

    public Supa createSoup(SupeEnum supa, Float cantitate){
        switch (supa){
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

    }
}
