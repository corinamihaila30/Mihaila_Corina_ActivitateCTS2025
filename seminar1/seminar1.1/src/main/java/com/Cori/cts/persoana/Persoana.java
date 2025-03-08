package com.Cori.cts.persoana;

import com.Cori.cts.persoana.IPersoana;

public abstract class Persoana implements IPersoana {
    private String nume;
    private Integer varsta;

    public abstract void afiseazaModInvatare();

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public Integer getVarsta() {
        return varsta;
    }

    public Persoana(String nume, Integer varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

}
