package spital.facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Salon salon = new Salon(1,20);
        Salon salon1 = new Salon(2,0);
        Medic medic = new Medic("Mihai Banacu","Neurologie");
        Medic medic1 = new Medic("Emila Cantir","Urgente");
        Pacient pacient =  new Pacient("Maria Ene",22,5,true);
        Pacient pacient1 = new Pacient("Florin Enescu",32,1,false);
        Facade facade = new Facade(medic1,salon);
        Facade facade1 = new Facade(medic,salon1);
        facade.verificaInternarePacient(pacient);
        System.out.println("------");
        facade1.verificaInternarePacient(pacient1);

    }
}