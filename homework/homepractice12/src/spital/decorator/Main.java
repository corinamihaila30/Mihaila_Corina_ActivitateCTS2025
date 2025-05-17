package spital.decorator;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hash = new HashMap<>();
        hash.put("TGB",100);
        hash.put("Homa",1);
        hash.put("Glicemia",30);
        Rezultat rezultat = new RezultatPrintat("Popescu Mirel",hash,true);
        rezultat.transmiteRezultat();

        System.out.println("-------------------");
        Rezultat rezDecorat = new RezultatOnline("Popescu Mirel", hash, true, rezultat);
        rezDecorat.transmiteRezultat();

    }
}