package spital.composite;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbstract {

    private List<StructuraAbstract> lista=new ArrayList<>();

    public Departament(String nume, Integer nrAngajati, List<StructuraAbstract> lista) {
        super(nume, nrAngajati);
        this.lista = lista;
    }

    public Departament(List<StructuraAbstract> lista) {
        this.lista = lista;
    }

    @Override
    public void adaugaNod(StructuraAbstract structuraAbstract) {
        lista.add(structuraAbstract);
    }

    @Override
    public void stergeNod(StructuraAbstract structuraAbstract) {
        lista.remove(structuraAbstract);
    }

    @Override
    public StructuraAbstract getNodCopii(Integer i) {
        return lista.get(i);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Departament"+this.getNume() + "contine urmatoarele subdepartamente");
        lista.stream().forEach(structuraAbstract -> {
            System.out.println(structuraAbstract);
        });
    }

    @Override
    public Integer calculeazaAngajati() {
        Integer suma = 0;
        for(StructuraAbstract s: lista){
            suma +=s.calculeazaAngajati();
        }
        return suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Departament{");
        sb.append("lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
}
