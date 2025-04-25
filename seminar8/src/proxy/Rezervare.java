package proxy;

public class Rezervare implements IRezervare{
    @Override
    public void realizareRezervare(String nume, Integer nrPers) {
        System.out.println("Rezervarea pe numele " + nume + " pentru " + nrPers + " persoane");
    }

}
