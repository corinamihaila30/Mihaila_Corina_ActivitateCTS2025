package spitalA1;

public class BuilderPacient implements IBuilder{

    private String nume;
    private Integer varsta;
    private Boolean dorestePatRabatabil;
    private Boolean doresteMicDejun;
    private Boolean dorestePapuci;
    private Boolean doresteHalat;

    public BuilderPacient(String nume, Integer varsta) {
        this.nume = nume;
        this.varsta = varsta;
        this.dorestePapuci=false;
        this.dorestePatRabatabil=false;
        this.doresteHalat=false;
        this.doresteMicDejun=true;
    }

    @Override
    public Pacient build() {
        return new Pacient(nume,varsta,dorestePatRabatabil,doresteMicDejun,dorestePapuci,doresteHalat);
    }

    public BuilderPacient addVarsta(Integer varsta) {
        this.varsta = varsta;
        return this;
    }

    public BuilderPacient addNume(String nume) {
        this.nume = nume;
        return this;
    }
    public BuilderPacient addDorestePatRabatabil(Boolean patRabatabil) {
        this.dorestePatRabatabil = patRabatabil;
        return this;
    }

    public BuilderPacient addDorestePapuci(Boolean papuci) {
        this.dorestePapuci = papuci;
        return this;
    }
    public BuilderPacient addDoresteHalat(Boolean halat) {
        this.doresteHalat = halat;
        return this;
    }

    public BuilderPacient addDoresteMicDejun(Boolean micdejun) {
        this.doresteMicDejun = micdejun;
        return this;
    }

}
