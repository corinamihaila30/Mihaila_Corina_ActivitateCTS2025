package facade;

public class Masa {
    private Integer nrMasa;
    private Boolean esteLibera;

    public Masa(Integer nrMasa, Boolean esteLibera) {
        this.nrMasa = nrMasa;
        this.esteLibera = esteLibera;
    }

    public Integer getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(Integer nrMasa) {
        this.nrMasa = nrMasa;
    }

    public Boolean getEsteLibera() {
        return esteLibera;
    }

    public void setEsteLibera(Boolean esteLibera) {
        this.esteLibera = esteLibera;
    }
}
