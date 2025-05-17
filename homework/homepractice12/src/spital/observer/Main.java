package spital.observer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UrgentaVirus urgentaVirus = new UrgentaVirus("periculos");
        urgentaVirus.abonareSpital(new FostiPacienti("Matei Simona"));
        urgentaVirus.abonareSpital(new FostiPacienti("Ionita Cosmin"));
        Pacient p = new FostiPacienti("Toma Gabriela");
        urgentaVirus.abonareSpital(p);
        urgentaVirus.notificarePacienti();
        System.out.println("----------");
        urgentaVirus.dezbonareSpital(p);
        urgentaVirus.notificarePacienti();
        System.out.println("------------");
        urgentaVirus.modificaStare("Rar");
        urgentaVirus.notificarePacienti();
    }
}