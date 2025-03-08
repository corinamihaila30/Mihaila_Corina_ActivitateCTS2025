package com.Cori.cts.persoana;

import com.Cori.cts.persoana.IPersoana;
import com.Cori.cts.persoana.IPredabil;
import com.Cori.cts.persoana.Persoana;

public class Profesor extends Persoana implements IPersoana, IPredabil {

    private String idAngajat;

    @Override
    public void afiseazaModInvatare() {

    }

    public String getIdAngajat() {
        return idAngajat;
    }

    public void preda(){
        StringBuilder mesaj = new StringBuilder();
        mesaj.append("Profesorul preda");
        System.out.println(mesaj);
    }

    public Profesor(String nume, Integer varsta, String idAngajat) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
    }
}
