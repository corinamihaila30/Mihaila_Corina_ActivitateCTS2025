package com.Cori.platforma;

import com.Cori.cts.persoana.IPredabil;
import com.Cori.cts.persoana.Persoana;
import com.Cori.cts.persoana.Profesor;
import com.Cori.cts.persoana.Student;

import java.util.ArrayList;

public class Curs {
    private String numeCurs;
    private Integer credite;
    private IPredabil profesor;
    private ArrayList<Student> students;

    public String getNumeCurs() {
        return numeCurs;
    }

    public Integer getCredite() {
        return credite;
    }

    public Curs(String numeCurs, Integer credite, IPredabil profesor, ArrayList<Student> students) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.students = students;
    }

    public void sustineExamen(){
        Persoana pers = (Persoana) profesor;
        StringBuilder mesaj = new StringBuilder();
        mesaj.append(pers.getNume());
        mesaj.append(" preda la ");
        mesaj.append(getNumeCurs());
        mesaj.append(" cu urmatorii studenti: ");
        students.stream().forEach(s->
        {
            mesaj.append("\n");
            mesaj.append(s.getNume());}
        );
        System.out.println(mesaj);
    }
}
