package com.Cori.cts.persoana;

import com.Cori.cts.persoana.Persoana;

public class Student extends Persoana {
    private Integer idStudent;

    public Student(String nume, Integer varsta, Integer idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    @Override
    public void afiseazaModInvatare() {

    }

    public Integer getIdStudent() {
        return idStudent;
    }

}
