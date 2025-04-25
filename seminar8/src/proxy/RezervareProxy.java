package proxy;

public class RezervareProxy implements IRezervare {
    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizareRezervare(String nume, Integer nrPers) {
        if(nrPers>=4){
            rezervare.realizareRezervare(nume,nrPers);
        }
        else {
            System.out.println("Nu este nevoie de rezervare");
        }
    }
}
