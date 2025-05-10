package plata.strategy;

public class Context {
    private String numeUtilizator;
    private IPlata tipPlata;
    public void setPlata(IPlata i){
        this.tipPlata=i;
    }
    public void plateste(){
        tipPlata.efectueazaPlata();
    }

    public Context(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
    }
}
