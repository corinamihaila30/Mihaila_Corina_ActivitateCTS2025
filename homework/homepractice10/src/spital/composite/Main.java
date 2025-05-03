package spital.composite;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ISectie sectie = new Sectie("Neurologie");
        ISectie sectie2 = new Sectie("Pediatrie");
        ISectie sectie3 = new Sectie("Cardiologie");
        Departament departament = new Departament("A");
        departament.addSectie(sectie);
        departament.addSectie(sectie2);
        departament.addSectie(sectie3);
        departament.primesteBuget(2000d);
    }
}