package spitalA2.angajati;

public class Medic extends PersonalSpital{
    private String specializare;
    public Medic(String nume, Float salariu, String hasContractPermanent) {
        super(nume, salariu, hasContractPermanent);
    }

    public Medic(){

    }

    @Override
    public void descriereAtributii(){
        System.out.println("Medicul " + super.nume +  " cu specializarea " + specializare);
    }
}
