package stb.composite;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GrupareAutobuz grupareAutobuz = new GrupareAutobuz("grupMic");
        grupareAutobuz.adaugaAutobuz(new AutobuzFlota("Dacia","A100",10));
        grupareAutobuz.adaugaAutobuz(new AutobuzFlota("BMW","A4",10));
        grupareAutobuz.adaugaAutobuz(new AutobuzFlota("Audi","A1",10));
        grupareAutobuz.VizualizareAutobuz();
        System.out.println(grupareAutobuz.getTip().toString());

    }
}