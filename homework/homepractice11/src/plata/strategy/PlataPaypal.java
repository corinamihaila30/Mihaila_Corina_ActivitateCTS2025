package plata.strategy;

public class PlataPaypal implements IPlata {

    @Override
    public void efectueazaPlata() {
        System.out.println("Plata se face cu Paypal\n");
    }

}
