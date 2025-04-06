package spitalA2;

import spitalA2.angajati.Asistent;
import spitalA2.angajati.Brancardier;
import spitalA2.angajati.Medic;
import spitalA2.angajati.PersonalSpital;

public class FactoryPersonal {

    public PersonalSpital getPersonalSpital(EnumPersonal personal){
        switch (personal){
            case BRANCARDIER -> {
                return new Brancardier();
            }
            case MEDIC -> {
                return new Medic();
            }
            case ASISTENT -> {
                return new Asistent();
            }
            default -> {
                return null;
            }
        }
    }
}
