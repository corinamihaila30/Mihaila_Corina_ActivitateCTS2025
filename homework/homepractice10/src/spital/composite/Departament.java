package spital.composite;

import java.util.ArrayList;
import java.util.List;

public class Departament implements ISectie{
    private String denumire;
    List<ISectie> lista = new ArrayList<>();

    public Departament(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void primesteBuget(Double d) {
        System.out.println("Din departamentul " + denumire + " primesc buget urmatoarele sectii: ");
        for (ISectie s:lista){
            s.primesteBuget(d);
        }
    }

    public void addSectie(ISectie s){
        lista.add(s);
    }

    public void deleteSectie(ISectie s){
        lista.remove(s);
    }
    public void getSectie(Integer i){
        lista.get(i);
    }

}
