package recap.patterns.singletonSiFactory.tipurimancare;

import recap.patterns.singletonSiFactory.tipurimancare.FelDeMancare;

public class SupaCiuperci extends FelDeMancare {
    public SupaCiuperci(Float cantitate, Float pret) {
        super(cantitate, pret);
    }

    @Override
    public void descriereProdus() {
        System.out.println("Supa de ciuperci");
    }
}
