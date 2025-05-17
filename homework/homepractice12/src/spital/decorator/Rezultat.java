package spital.decorator;

import java.util.HashMap;

public abstract class Rezultat {
    private String numePacient;
    private HashMap<String,Integer> analizaRezultat;
    private Boolean rezultateComplete;
   public abstract void transmiteRezultat();

    public String getNumePacient() {
        return numePacient;
    }

    public HashMap<String, Integer> getAnalizaRezultat() {
        return analizaRezultat;
    }

    public Boolean getRezultateComplete() {
        return rezultateComplete;
    }

    public Rezultat(String numePacient, HashMap<String, Integer> analizaRezultat, Boolean rezultateComplete) {
        this.numePacient = numePacient;
        this.analizaRezultat = analizaRezultat;
        this.rezultateComplete = rezultateComplete;
    }

    public Rezultat(){

    }
}
