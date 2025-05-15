package stb;

import stb.Plata;

public class Calator {
    private String nume;
    private Plata tipPlata;
    public void setStrategie(Plata tipPlata){
        this.tipPlata = tipPlata;
    }

    public Calator(String nume) {
        this.nume = nume;
    }

    public void efectuareaPlatii(Float pret) {
        tipPlata.efectuarePlata(pret);
    }
}
