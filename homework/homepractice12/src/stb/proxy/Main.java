package stb.proxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AutobuzNoapte autobuzNoapte = new AutobuzNoapte(0);
        Proxy proxy = new Proxy(autobuzNoapte);
        proxy.activitateAutobuz();
        System.out.println("----------------");
        AutobuzNoapte autobuzNoapte1= new AutobuzNoapte(10);
        Proxy proxy1 = new Proxy(autobuzNoapte1);
        proxy1.activitateAutobuz();
    }
}