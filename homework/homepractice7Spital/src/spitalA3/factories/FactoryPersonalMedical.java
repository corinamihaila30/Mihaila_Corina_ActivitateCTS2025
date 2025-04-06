package spitalA3.factories;

import spitalA3.angajati.Asistent;
import spitalA3.angajati.Medic;
import spitalA3.angajati.PersonalSpital;
import spitalA3.enums.IPersonal;
import spitalA3.enums.PersonalMedicalEnum;

public class FactoryPersonalMedical implements IFactory {

    @Override
    public PersonalSpital getPersonal(IPersonal personal) {
        PersonalMedicalEnum pMedical = (PersonalMedicalEnum) personal;
        switch (pMedical){
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
