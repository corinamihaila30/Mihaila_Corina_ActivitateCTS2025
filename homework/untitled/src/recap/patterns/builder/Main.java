package recap.patterns.builder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HanoracBuilder hanoracBuilder = new HanoracBuilder("rosu",200f);
        Hanorac hanorac = hanoracBuilder.addDetails(true).build();
        System.out.println(hanorac);
    }
}