package spitalA3.factories;

import spitalA3.angajati.PersonalSpital;
import spitalA3.enums.IPersonal;

public interface IFactory {
    PersonalSpital getPersonal(IPersonal personal);
}
