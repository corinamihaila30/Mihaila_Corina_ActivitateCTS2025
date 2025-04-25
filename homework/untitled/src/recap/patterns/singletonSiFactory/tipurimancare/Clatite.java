package recap.patterns.singletonSiFactory.tipurimancare;

public class Clatite extends FelDeMancare {
    public Clatite(Float cantitate, Float pret) {
        super(cantitate, pret);
    }

    @Override
    public void descriereProdus() {
        System.out.println("Clatiteeee");
    }
}
