package recap.simpleFactory;

public class FactoryPlata {

    public Plata getPlata(PlataEnum den){
        switch (den){
            case PLATA_INSTANT -> {
                return new PlataInstant();
            }
            case PLATA_ULTERIOR -> {
                return new PlataUlterior();
            }
            case null -> {
                return null;
            }
        }
    }
}
