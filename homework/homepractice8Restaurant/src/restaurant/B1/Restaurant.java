package restaurant.B1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Restaurant {
    public static void main(String[] args) {
        FactorySupe factorySupe = new FactorySupe();
        Supa supa = factorySupe.createSoup(SupeEnum.SUPA_VITA,200f);
        supa.descriereSupa();
    }
}