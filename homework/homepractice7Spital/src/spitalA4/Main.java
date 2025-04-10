package spitalA4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(100f,200f,500f);
        Reteta reteta1 = reteta.clone();
        reteta1.setCantitateMagneziu(200f);
        System.out.println(reteta);
        System.out.println(reteta1);
    }
}