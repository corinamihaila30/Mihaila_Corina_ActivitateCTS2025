package spital.composite;

public class Sectie implements ISectie{
    private String denumire;
    public void primesteBuget(Double d){
        System.out.println("Sectia " + denumire + " primeste buget de: " + d );
    }

    public Sectie(String denumire) {
        this.denumire = denumire;
    }
}
