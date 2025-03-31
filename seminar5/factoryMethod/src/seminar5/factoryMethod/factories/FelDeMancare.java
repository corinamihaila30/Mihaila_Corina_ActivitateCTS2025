package seminar5.factoryMethod.factories;

public abstract class FelDeMancare {
    private Float pret;
    private Integer nrCalorii;

    public FelDeMancare(Float pret, Integer nrCalorii) {
        this.pret = pret;
        this.nrCalorii = nrCalorii;
    }

    @Override
    public String toString() {
        return "FelDeMancare{" +
                "pret=" + pret +
                ", nrCalorii=" + nrCalorii +
                '}';
    }
}
