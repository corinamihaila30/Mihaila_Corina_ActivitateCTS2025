package seminar5.factoryMethod;

import seminar5.factoryMethod.factories.FelDeMancare;

public class Clatite extends FelDeMancare {
    private String clatite;


    public Clatite(Float pret, Integer nrCalorii) {
        super(pret, nrCalorii);
    }

    @Override
    public String toString() {
        return "Clatite{" +
                "clatite='" + clatite + '\'' +
                "} " + super.toString();
    }

    public String getClatite() {
        return clatite;
    }

    public void setClatite(String clatite) {
        this.clatite = clatite;
    }
}
