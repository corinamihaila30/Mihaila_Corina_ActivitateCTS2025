package spitalA1;

public class Pacient {
    private String nume;
    private Integer varsta;
    private Boolean dorestePatRabatabil;
    private Boolean doresteMicDejun;
    private Boolean dorestePapuci;
    private Boolean doresteHalat;

    public Pacient(String nume, Integer varsta, Boolean dorestePatRabatabil, Boolean doresteMicDejun, Boolean dorestePapuci, Boolean doresteHalat) {
        this.nume = nume;
        this.varsta = varsta;
        this.dorestePatRabatabil = dorestePatRabatabil;
        this.doresteMicDejun = doresteMicDejun;
        this.dorestePapuci = dorestePapuci;
        this.doresteHalat = doresteHalat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Boolean getDorestePatRabatabil() {
        return dorestePatRabatabil;
    }

    public void setDorestePatRabatabil(Boolean dorestePatRabatabil) {
        this.dorestePatRabatabil = dorestePatRabatabil;
    }

    public Boolean getDoresteMicDejun() {
        return doresteMicDejun;
    }

    public void setDoresteMicDejun(Boolean doresteMicDejun) {
        this.doresteMicDejun = doresteMicDejun;
    }

    public Boolean getDorestePapuci() {
        return dorestePapuci;
    }

    public void setDorestePapuci(Boolean dorestePapuci) {
        this.dorestePapuci = dorestePapuci;
    }

    public Boolean getDoresteHalat() {
        return doresteHalat;
    }

    public void setDoresteHalat(Boolean doresteHalat) {
        this.doresteHalat = doresteHalat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", dorestePatRabatabil=").append(dorestePatRabatabil);
        sb.append(", doresteMicDejun=").append(doresteMicDejun);
        sb.append(", dorestePapuci=").append(dorestePapuci);
        sb.append(", doresteHalat=").append(doresteHalat);
        sb.append('}');
        return sb.toString();
    }
}
