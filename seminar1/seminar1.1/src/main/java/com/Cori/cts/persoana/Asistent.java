package com.Cori.cts.persoana;

public class Asistent extends Persoana implements IPersoana, IPredabil {
    protected Integer id;
    protected Integer experienta;

    public Asistent(String nume, Integer varsta, Integer id, Integer experienta) {
        super(nume, varsta);
        this.id = id;
        this.experienta = experienta;
    }

    @Override
    public void afiseazaModInvatare() {

    }

    @Override
    public String getNume() {
        return null;
    }

    @Override
    public Integer getVarsta() {
        return null;
    }

    public void preda(){
        StringBuilder mesaj = new StringBuilder();
        mesaj.append(super.getNume());
        mesaj.append(" Asistentul preda la seminar");
        System.out.println(mesaj);
    }
}
