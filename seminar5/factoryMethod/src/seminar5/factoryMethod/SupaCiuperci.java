package seminar5.factoryMethod;

import seminar5.factoryMethod.factories.FelDeMancare;

public class SupaCiuperci extends FelDeMancare {
    private Integer cantitate;


    public SupaCiuperci(Float pret, Integer nrCalorii) {
        super(pret, nrCalorii);
    }

    @Override
    public String toString() {
        return "SupaCiuperci{" +
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
