package recap.prototype;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainPrototype {
    public static void main(String[] args) {
        Floare floare = new Floare("Lalea","alba");
        Floare floare2 = floare.cloneFloare();
        floare2.setCuloare("rosie");
        System.out.println(floare);
        System.out.println(floare2);

    }
}