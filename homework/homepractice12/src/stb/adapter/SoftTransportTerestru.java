package stb.adapter;

public class SoftTransportTerestru {
    private Boolean validatAnterior;
    private Integer nrCalatorii;
    public void cumparaBilet(){
        System.out.println("Biletul a fost cumparat");
    }

    public void cumparaAbonament(String codPasager){
        System.out.println("Pentru pasagerul avand codul: " + codPasager + " a fost cumparat biletul");
    }

    public SoftTransportTerestru(Boolean validatAnterior, Integer nrCalatorii) {
        this.validatAnterior = validatAnterior;
        this.nrCalatorii = nrCalatorii;
    }

    public Boolean getValidatAnterior() {
        return validatAnterior;
    }

    public void setValidatAnterior(Boolean validatAnterior) {
        this.validatAnterior = validatAnterior;
    }

    public Integer getNrCalatorii() {
        return nrCalatorii;
    }

    public void setNrCalatorii(Integer nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }
}
