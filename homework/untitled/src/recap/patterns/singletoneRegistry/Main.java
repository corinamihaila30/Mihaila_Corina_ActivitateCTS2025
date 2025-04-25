package recap.patterns.singletoneRegistry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetTransport();
        PachetTuristic pachetTuristic2 = new PachetTransport();
        Registry.register("cheie1",pachetTuristic);
        Registry.register("cheie1", pachetTuristic2);
        System.out.println(Registry.getPachet("cheie1"));

    }
}