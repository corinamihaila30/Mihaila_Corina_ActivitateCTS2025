package spital.decorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rezultat rezultat = new Rezultat("TGP",60.5d,"< 100");
        IRezultat abstractDecorator = new DecoratorOnline(rezultat);
        serviceMethod(abstractDecorator);
    }


    public static void serviceMethod(IRezultat r){
        r.printareRezultat();
    }
}