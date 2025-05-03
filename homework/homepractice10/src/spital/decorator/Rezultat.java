package spital.decorator;

public class Rezultat implements IRezultat{
    private String denumireAnaliza;
    private Double valoareRezultat;
    private String valoareNormala;

    public Rezultat(String denumireAnaliza, Double valoareRezultat, String valoareNormala) {
        this.denumireAnaliza = denumireAnaliza;
        this.valoareRezultat = valoareRezultat;
        this.valoareNormala = valoareNormala;
    }

    public void printareRezultat(){
        System.out.println("Rezultatele analizelor printate sunt urmatoarele:\n");
        System.out.println("Analiza " + denumireAnaliza + " are valoarea: " + valoareRezultat + " valoare normala este de: " + valoareNormala);
    }

    public String getDenumireAnaliza() {
        return denumireAnaliza;
    }

    public Double getValoareRezultat() {
        return valoareRezultat;
    }

    public String getValoareNormala() {
        return valoareNormala;
    }
}
