package spital.composite;

public class Sectie extends StructuraAbstract{
    @Override
    public void adaugaNod(StructuraAbstract structuraAbstract) {

    }

    public Sectie(String nume, Integer nrAngajati) {
        super(nume, nrAngajati);
    }

    public Sectie() {
    }

    @Override
    public void stergeNod(StructuraAbstract structuraAbstract) {

    }

    @Override
    public StructuraAbstract getNodCopii(Integer i) {
        return null;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sectie" + this.toString());
    }

    @Override
    public Integer calculeazaAngajati() {
        return this.calculeazaAngajati();
    }
}
