package seminar3.builder.restaurant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RezervareManager {
    public static void main(String[] args) {
        AbstractBuilder abstractBuilder = new RezervareBuilder("Andrei");
        Rezervare rezervare1 = abstractBuilder.buildRezervare();

    }
}