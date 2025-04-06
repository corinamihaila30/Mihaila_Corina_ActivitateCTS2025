package spitalA2.angajati;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, Float salariu, String hasContractPermanent) {
        super(nume, salariu, hasContractPermanent);
    }

    public Brancardier() {
    }

    @Override
    public void descriereAtributii(){
        System.out.println("Brancardierul asigura confort pacientilor");
    }
}
