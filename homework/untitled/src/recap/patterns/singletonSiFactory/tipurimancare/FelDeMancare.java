package recap.patterns.singletonSiFactory.tipurimancare;

public abstract class FelDeMancare {
    private Float cantitate;
    private Float pret;

    public FelDeMancare(Float cantitate, Float pret) {
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public abstract void descriereProdus();
}
