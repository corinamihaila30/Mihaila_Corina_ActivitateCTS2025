package stb.composite;

import java.util.ArrayList;
import java.util.List;

public class GrupareAutobuz extends AbsAutobuz{
    private List<AbsAutobuz> lista=new ArrayList<>();
    private String tip;
    @Override
    public void VizualizareAutobuz() {
        for(AbsAutobuz a:lista){
            a.VizualizareAutobuz();
        }
    }

    @Override
    public void adaugaAutobuz(AbsAutobuz autobuz) {
        lista.add(autobuz);
    }

    @Override
    public void stergeAutobuz(AbsAutobuz autobuz) {
        lista.remove(autobuz);
    }

    @Override
    public AbsAutobuz getNodCopil(Integer i) {
        return lista.get(i);
    }

    public GrupareAutobuz(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
