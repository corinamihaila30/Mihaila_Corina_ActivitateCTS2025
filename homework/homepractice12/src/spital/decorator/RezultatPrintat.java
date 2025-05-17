package spital.decorator;

import java.util.HashMap;

public class RezultatPrintat extends Rezultat {

    public RezultatPrintat(String numePacient, HashMap<String, Integer> analizaRezultat, Boolean rezultateComplete) {
        super(numePacient, analizaRezultat, rezultateComplete);
    }

    @Override
    public void transmiteRezultat() {
        if(super.getRezultateComplete() == true){
            System.out.println("Pacientul" + super.getNumePacient()+ "\n"+
                    "Are urmatorul raport medical:" + "\n");
            System.out.println(super.getAnalizaRezultat().toString());
        }
        else {
            System.out.println("Raportul nu este gata");
        }
    }
}
