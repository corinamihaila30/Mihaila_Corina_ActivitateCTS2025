package recap.singleton;

public class ParlamentRoEagger {
    private String adresa;
    private Integer nrAngajati;
    private Boolean esteProtejat;
    public static ParlamentRoEagger parlamentRo = new ParlamentRoEagger("Constitutiei",100,true);

    private ParlamentRoEagger(String adresa, Integer nrAngajati, Boolean esteProtejat) {
        this.adresa = adresa;
        this.nrAngajati = nrAngajati;
        this.esteProtejat = esteProtejat;
    }

    public static ParlamentRoEagger getInstance(){
            return parlamentRo;
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

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setNrAngajati(Integer nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public void setEsteProtejat(Boolean esteProtejat) {
        this.esteProtejat = esteProtejat;
    }

    public static void setParlamentRo(ParlamentRoEagger parlamentRo) {
        ParlamentRoEagger.parlamentRo = parlamentRo;
    }
}
