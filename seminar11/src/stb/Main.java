package stb;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Maria Ionica");
        calator.setStrategie(new PlataCardCalatorii(10));
        calator.efectuareaPlatii(5f);
    }
}