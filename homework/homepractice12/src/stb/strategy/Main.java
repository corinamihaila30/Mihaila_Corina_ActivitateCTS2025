package stb.strategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Plata plata = new PlataCalatorii(2);
        ValidatorCalatorie validatorCalatorie = new ValidatorCalatorie();
        validatorCalatorie.setPlata(plata);
        validatorCalatorie.valideazaPlata();
    }
}