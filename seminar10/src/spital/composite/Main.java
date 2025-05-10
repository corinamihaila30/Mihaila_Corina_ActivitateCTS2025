package spital.composite;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<StructuraAbstract> lista = new ArrayList<>();
        StructuraAbstract sectie = new Sectie("Neurologie",20);
        StructuraAbstract sectie1 = new Sectie("Cardilogie",12);
        lista.add(sectie);
        lista.add(sectie1);
        StructuraAbstract departament = new Departament("departament1",30,lista);
        departament.afiseazaDescriere();

    }
}