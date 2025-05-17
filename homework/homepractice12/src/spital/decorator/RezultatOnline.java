package spital.decorator;

import java.util.HashMap;

public class RezultatOnline extends RezultatDecorator{

    public RezultatOnline(String numePacient, HashMap<String, Integer> analizaRezultat, Boolean rezultateComplete, Rezultat rezultat) {
        super(numePacient, analizaRezultat, rezultateComplete);
        this.rezultatDecorat = rezultat;
    }



    @Override
    public void transmiteRezultat() {
        rezultatDecorat.transmiteRezultat();
        afisareOnline();
    }

    public void afisareOnline(){
        System.out.println("Pacientul" + super.getNumePacient()+ "\n"+
                "Are urmatorul raport medical:" + "\n");
        System.out.println(super.getAnalizaRezultat().toString());
    }
}
