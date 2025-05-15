package observer;

public class Calator implements ObserverO {
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifica(String mesaj) {

    }
}
