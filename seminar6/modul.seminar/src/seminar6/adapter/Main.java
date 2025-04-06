package seminar6.adapter;

import seminar6.adapter.clase.AdapterMedicamente;
import seminar6.adapter.clase.MedicamentFarmacie;
import seminar6.adapter.clase.MedicamentSpital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    };


    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital("Klabax",20f);
        AdapterMedicamente adapterMedicamente = new AdapterMedicamente(medicamentSpital);
        vindeMedicament(adapterMedicamente);
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Arcoxia",30f,true);
        AdapterMedicamente adapterMedicamente1 = new AdapterMedicamente(medicamentSpital);
        vindeMedicament(adapterMedicamente1);
    }
}