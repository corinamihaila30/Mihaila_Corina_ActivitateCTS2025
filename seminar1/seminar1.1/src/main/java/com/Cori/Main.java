package com.Cori;

import com.Cori.cts.persoana.Asistent;
import com.Cori.cts.persoana.IPredabil;
import com.Cori.cts.persoana.Profesor;
import com.Cori.cts.persoana.Student;
import com.Cori.platforma.Curs;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Asistent asistent = new Asistent("Marian",20,40,20);
        asistent.preda();
        IPredabil profesor = new Profesor("Marian",50,"C1234");
        profesor.preda();
        ArrayList<Student> listaStudenti = new ArrayList<>();
        Student student = new Student("Corina",21,100);
        Student student1 = new Student("Maria",21,101);
        listaStudenti.add(student);
        listaStudenti.add(student1);
        Curs curs1=new Curs("DAM",5,profesor,listaStudenti);
        curs1.sustineExamen();
    }
}