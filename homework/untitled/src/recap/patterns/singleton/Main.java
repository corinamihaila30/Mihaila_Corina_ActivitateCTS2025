package recap.patterns.singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Guvern guvern = Guvern.getInstance("Romania",100);
        Guvern guvern2 = Guvern.getInstance("Romania",100);
        guvern2.setDen("Albania");
        System.out.println(guvern2);
        System.out.println(guvern);
    }
}