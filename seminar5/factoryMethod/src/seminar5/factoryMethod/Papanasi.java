package seminar5.factoryMethod;

import seminar5.factoryMethod.factories.FelDeMancare;

public class Papanasi extends FelDeMancare {
    private String crema;

    public Papanasi(Float pret, Integer nrCalorii) {
        super(pret, nrCalorii);
    }

    @Override
    public String toString() {
        return "Papanasi{" +
                "crema='" + crema + '\'' +
                "} " + super.toString();
    }

    public String getCrema() {
        return crema;
    }

    public void setCrema(String crema) {
        this.crema = crema;
    }
}
