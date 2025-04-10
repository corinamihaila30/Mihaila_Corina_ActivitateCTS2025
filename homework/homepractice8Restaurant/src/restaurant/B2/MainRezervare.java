package restaurant.B2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainRezervare {
    public static void main(String[] args) {
        Rezervare.RezervareBuilder rezervareBuilder =new Rezervare.RezervareBuilder("Maria");
        Rezervare rezervare = rezervareBuilder.addAsezareLaGeam(true).addNrPersoane(2).addScaun(true).build();
        System.out.println(rezervare);
    }
}