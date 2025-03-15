package singleton.clase;

import singleton.clase.clase.AgentieImobiliara;
import singleton.clase.clase.AgentieImobiliaraLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgentieImobiliara agentieImobiliara = AgentieImobiliara.getAgentieImobiliara();
        AgentieImobiliaraLazy agentie = AgentieImobiliaraLazy.getAgentieImobiliaraLazy();
        AgentieImobiliara agentie2 = AgentieImobiliara.getAgentieImobiliara();
        agentie2.setDenumire("Cori");
        System.out.println(agentie2.toString());
        System.out.println(agentieImobiliara.toString());
        agentie2.posteazaAnunt();
        agentieImobiliara.posteazaAnunt();
        System.out.println(agentieImobiliara.toString());
    }
}