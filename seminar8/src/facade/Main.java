package facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Masa masa =new Masa(6,true);
        Masa masa1 =new Masa(2,true);
        Masa masa2 =new Masa(3,false);
        Masa masa3 =new Masa(4,true);
        Masa masa4 =new Masa(5,false);
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();
        Facade facade = new Facade();
        facade.verificaAsezareMasa(masa);
        System.out.println(facade.verificaAsezareMasa(masa));
    }
}