package recap.patterns.Proto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Elicopter elicopter = new Elicopter("JWT",200000);
        Elicopter elicopter1 = elicopter.cloneaza();
        elicopter1.setPret(3000000);
        System.out.println(elicopter1);
        System.out.println(elicopter);
    }
}