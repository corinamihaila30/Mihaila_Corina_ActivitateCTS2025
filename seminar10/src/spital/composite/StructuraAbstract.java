package spital.composite;

public abstract class StructuraAbstract {
    private String nume;
    private Integer nrAngagajti;

    public StructuraAbstract(String nume, Integer numeAngagajti) {
        this.nume = nume;
        this.nrAngagajti = numeAngagajti;
    }

    public StructuraAbstract() {
    }

    public abstract void adaugaNod(StructuraAbstract structuraAbstract);
    public abstract void stergeNod(StructuraAbstract structuraAbstract);
    public abstract StructuraAbstract getNodCopii(Integer i);

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getNumeAngagajti() {
        return nrAngagajti;
    }

    public void setNumeAngagajti(Integer numeAngagajti) {
        this.nrAngagajti = numeAngagajti;
    }

    public abstract void afiseazaDescriere();

    public abstract Integer calculeazaAngajati();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StructuraAbstract{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nr anagajati=").append(nrAngagajti);
        sb.append('}');
        return sb.toString();
    }
}
