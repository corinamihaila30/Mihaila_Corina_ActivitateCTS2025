package template;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TramvaiAbstract tramvai  = new Tramvai(41);
        tramvai.parcurgeTur();
        System.out.println("----------------");
        tramvai.parcurgeRetur();
    }
}