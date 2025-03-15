import bakery.singleton.BakeryLazy;
import bakery.singleton.BakeryRegistry;
import bakery.singleton.Chocolate;
import bakery.singleton.Cookie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        BakeryEager bakeryEager = BakeryEager.getInstance();
//        BakeryEager bakeryEager2 = BakeryEager.getInstance();
//        bakeryEager2.setLocation("Zurich");
//        System.out.println(bakeryEager);
//        BakeryLazy bakeryLazy = BakeryLazy.getInstance();
//        System.out.println(bakeryLazy);
//        BakeryLazy bakeryLazy1 = BakeryLazy.getInstance();
//        bakeryLazy1.setLocation("London");
//        System.out.println(bakeryLazy1);
//        System.out.println(bakeryLazy);
//        BakeryThreadSafe bakeryThreadSafe = BakeryThreadSafe.getInstance();
//        System.out.println(bakeryThreadSafe);

        Cookie cookie = new Cookie("C1","Cookie with choco chips","Nutella");
        Chocolate chocolate = new Chocolate("C1","Chocolate Vanilla","Nutella");
        Chocolate chocolate2 = new Chocolate("C2","Chocolate Vanilla","Nutella");
        BakeryRegistry bakeryRegistry = BakeryRegistry.getBakeryRegistry();
        bakeryRegistry.prepare(cookie);
        bakeryRegistry.prepare(chocolate);
        bakeryRegistry.prepare(chocolate2);
    }
}