package spital.facade;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    private String nume;
    private String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public Boolean verificaPacient(){
        if(specializare.equalsIgnoreCase("urgente")){
            return true;
        }
        return false;
    }
}
