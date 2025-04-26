package spital.facade;

public class Pacient {
    private String nume;
    private Integer varsta;
    private Integer nrSimptome;
    private boolean esteDeshidratat;

    public Pacient(String nume, Integer varsta, Integer nrSimptome, boolean esteDeshidratat) {
        this.nume = nume;
        this.varsta = varsta;
        this.nrSimptome = nrSimptome;
        this.esteDeshidratat = esteDeshidratat;
    }

    public Boolean verificareStare(){
        if(nrSimptome>=3 && esteDeshidratat==true){
            return true;
        }
        return false;
    }
    public String getNume() {
        return nume;
    }

    public Integer getVarsta() {
        return varsta;
    }
}
