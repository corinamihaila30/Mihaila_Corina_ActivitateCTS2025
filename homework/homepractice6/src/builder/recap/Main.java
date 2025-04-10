package builder.recap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BiletTren.TrenBuilder trenBuilder = new BiletTren.TrenBuilder("Paris",200);
        BiletTren tren = trenBuilder.addClasa1(true).addMasaInlcusa(true).build();
        BiletTren tren2 = new BiletTren.TrenBuilder("Paris", 200).addClasa1(true).build();
        System.out.println(tren);
        System.out.println(tren2);

    }
}