package seminar6.adapter.clase;

public class AdapterMedicamente extends MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;


    public AdapterMedicamente(String nume, Float pret, Boolean esteStoc) {
        super(nume, pret, esteStoc);
    }

    public AdapterMedicamente(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(),medicamentSpital.getPret(),true);
        this.medicamentSpital=medicamentSpital;

    }

    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }

}
