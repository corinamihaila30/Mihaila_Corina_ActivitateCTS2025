package recap.singleton;

public class ParlamentRo {
    private String adresa;
    private Integer nrAngajati;
    private Boolean esteProtejat;
    public static ParlamentRo parlamentRo;

    private ParlamentRo(String adresa, Integer nrAngajati, Boolean esteProtejat) {
        this.adresa = adresa;
        this.nrAngajati = nrAngajati;
        this.esteProtejat = esteProtejat;
    }

    public static synchronized ParlamentRo getInstance(String adresa, Integer nrAngajati, Boolean esteProtejat){
        if (parlamentRo==null)
            parlamentRo = new ParlamentRo(adresa,nrAngajati,esteProtejat);
        return parlamentRo;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Integer getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(Integer nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public Boolean getEsteProtejat() {
        return esteProtejat;
    }

    public void setEsteProtejat(Boolean esteProtejat) {
        this.esteProtejat = esteProtejat;
    }


    public static void setParlamentRo(ParlamentRo parlamentRo) {
        ParlamentRo.parlamentRo = parlamentRo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParlamentRo{");
        sb.append("adresa='").append(adresa).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", esteProtejat=").append(esteProtejat);
        sb.append('}');
        return sb.toString();
    }
}
