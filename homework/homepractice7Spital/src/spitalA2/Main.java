package spitalA2;

import spitalA2.angajati.PersonalSpital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FactoryPersonal();
        PersonalSpital medic = factoryPersonal.getPersonalSpital(EnumPersonal.MEDIC);

        medic.descriereAtributii();
    }
}