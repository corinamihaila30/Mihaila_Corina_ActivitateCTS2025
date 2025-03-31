import factoryMethod.recap.MetodaPlata;
import factoryMethod.recap.PlataInstant;
import factoryMethod.recap.enums.EnumPlataInstant;
import factoryMethod.recap.enums.EnumPlataUlterioara;
import factoryMethod.recap.factories.FactoryMetodaPlataInstant;
import factoryMethod.recap.factories.FactoryMetodaPlataUlterioara;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FactoryMetodaPlataInstant factory1 = new FactoryMetodaPlataInstant();
        MetodaPlata plata = factory1.getMetodaDePlata(EnumPlataInstant.CASH);
        FactoryMetodaPlataUlterioara factory2 = new FactoryMetodaPlataUlterioara();
        MetodaPlata plata2 = factory2.getMetodaDePlata(EnumPlataUlterioara.Depozit);
        plata.descriere();
        plata2.descriere();
    }
}