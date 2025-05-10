public class Pacient implements IFlyweight{
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public Pacient() {

    }

    @Override
    public void descriereInternare(Internare i) {
        System.out.println("Pacientul: "  +  nume);
        System.out.println("Adresa: " + adresa);
        System.out.println("Nr de contact: " + nrTelefon);
        System.out.println("Datele internarii sunt: ");
        System.out.println(i.toString());
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
