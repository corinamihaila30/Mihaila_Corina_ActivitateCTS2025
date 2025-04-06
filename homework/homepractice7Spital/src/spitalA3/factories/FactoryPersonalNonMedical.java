package spitalA3.factories;

import spitalA3.angajati.Brancardier;
import spitalA3.angajati.PersonalSpital;
import spitalA3.angajati.Registrator;
import spitalA3.angajati.Secretar;
import spitalA3.enums.IPersonal;
import spitalA3.enums.PersonalNonMedicalEnum;

public class FactoryPersonalNonMedical implements IFactory {
    @Override
    public PersonalSpital getPersonal(IPersonal iPersonal) {
        PersonalNonMedicalEnum personalNonMedical = (PersonalNonMedicalEnum) iPersonal;
        switch (personalNonMedical){
            case BRANCARDIER -> {
                return new Brancardier();
            }
            case REGISTRATOR -> {
                return new Registrator();
            }
            case SECRETAR -> {
                return new Secretar();
            }
            default -> {
                return null;
            }
        }
    }
}
