package proxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        IRezervare proxy = new RezervareProxy(rezervare);
        proxy.realizareRezervare("Corina",2);

    }
}