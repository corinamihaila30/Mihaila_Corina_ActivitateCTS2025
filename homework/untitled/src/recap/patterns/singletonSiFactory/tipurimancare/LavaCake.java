package recap.patterns.singletonSiFactory.tipurimancare;

import recap.patterns.singletonSiFactory.tipurimancare.FelDeMancare;

public class LavaCake extends FelDeMancare {
    public LavaCake(Float cantitate, Float pret) {
        super(cantitate, pret);
    }

    @Override
    public void descriereProdus() {
        System.out.println("Lava cake cu inghetata de vanilie");
    }
}
