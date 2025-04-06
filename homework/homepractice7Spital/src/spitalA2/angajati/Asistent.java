package spitalA2.angajati;

public class Asistent extends PersonalSpital{
    private String sectie;
    public Asistent(String nume, Float salariu, String hasContractPermanent) {
        super(nume, salariu, hasContractPermanent);
    }

    public Asistent(){

    }
    @Override
    public void descriereAtributii(){
        System.out.println("Asistentul " + super.nume + " lucreaza in sectia de " + sectie);
    }
}
