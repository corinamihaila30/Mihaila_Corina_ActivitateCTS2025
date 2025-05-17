package spital.decorator;

import java.util.HashMap;

public abstract class RezultatDecorator extends Rezultat{
    protected Rezultat rezultatDecorat;

    public RezultatDecorator(String numePacient, HashMap<String, Integer> analizaRezultat, Boolean rezultateComplete) {
        super(numePacient, analizaRezultat, rezultateComplete);
    }

    public RezultatDecorator(){
        super();
    };



}
