package seminar5.factoryMethod;

import seminar5.factoryMethod.factories.FelDeMancare;

public class SupaLegume extends FelDeMancare {
    private Integer cantitate;


    public SupaLegume(Float pret, Integer nrCalorii) {
        super(pret, nrCalorii);
    }

    @Override
    public String toString() {
        return "SupaLegume{" +
                "cantitate=" + cantitate +
                "} " + super.toString();
    }

    public Integer getCantitate() {
        return cantitate;
    }

    public void setCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }
}
