import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FactoryPacient factoryPacient = new FactoryPacient();
        Pacient p = (Pacient) factoryPacient.getItem("Maria Ion","0753618721","Casmir Ion nr 10");
        Pacient p1 = (Pacient) factoryPacient.getItem("Dumitru Elena","0753642321","Dragomiresti nr 3");
        System.out.println("-------------");
        p.descriereInternare(new Internare(3,1,10));
        System.out.println("-------------");
        p1.descriereInternare(new Internare(3,4,5));
        Pacient p3 = (Pacient) factoryPacient.getItem("Maria Ion","0753618721","Casmir Ion nr 10");
        System.out.println("-------------");
        p3.descriereInternare(new Internare(3,1,10));
    }
}