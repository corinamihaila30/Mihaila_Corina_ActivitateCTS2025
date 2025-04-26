package spital.facade;

import javax.swing.*;

public class Facade  {
    private Medic medic;
    private Salon salon;

    public Facade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void verificaInternarePacient(Pacient pacient){
        if(medic.verificaPacient() && pacient.verificareStare()){
            if(salon.existaLocLiber()){
                System.out.println("Pacientul " + pacient.getNume() + " necesita internare si poate fi internat acum");
            }
            else System.out.println("Pacientul "+ pacient.getNume() + " necesita internare dar nu sunt locuri libere");
        }
        else {
            System.out.println("Nu este necesara internarea pentru pacientul " + pacient.getNume());
        }
    }
}
