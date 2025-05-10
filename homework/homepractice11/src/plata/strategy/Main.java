package plata.strategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Context context = new Context("corina");
        context.setPlata(new PlataCardIP());
        context.plateste();
        context.setPlata(new PlataPaypal());
        context.plateste();

    }
}