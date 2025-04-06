package spitalA3;

import spitalA2.FactoryPersonal;
import spitalA3.angajati.PersonalSpital;
import spitalA3.enums.IPersonal;
import spitalA3.enums.PersonalMedicalEnum;
import spitalA3.enums.PersonalNonMedicalEnum;
import spitalA3.factories.FactoryPersonalMedical;
import spitalA3.factories.FactoryPersonalNonMedical;
import spitalA3.factories.IFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IFactory factoryPersonalNonMedical = new FactoryPersonalNonMedical();
        IPersonal iPersonal;
        PersonalSpital p = factoryPersonalNonMedical.getPersonal(PersonalNonMedicalEnum.SECRETAR);
        p.descriereAtributii();
    }
}