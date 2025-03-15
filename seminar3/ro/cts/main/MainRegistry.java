package ro.cts.main;

import ro.cts.anunturi.AgentieImobiliara;
import ro.cts.anunturi.Anunt;

//instanta unica per obiect => regidtry

public class MainRegistry {
    public static void main(String[] args) {
        AgentieImobiliara agentie = new AgentieImobiliara("Imobiliare.ro",120000);
        Anunt anunt = agentie.getAnunt("Piata Romana","Popescu",3);
        Anunt anunt2 = agentie.getAnunt("Piata Universitatii","Ionescu",3);
        Anunt anunt3 = agentie.getAnunt("Piata Romana","Vasilescu",3);

        System.out.println(anunt3);
    }
}
