package recap.patterns.singleton;

public class Guvern {
    private String den;
    private Integer nrAngajati;
    private static Guvern guvern;

    private Guvern(String den, Integer nrAngajati) {
        this.den = den;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Guvern{");
        sb.append("den='").append(den).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }

    public static synchronized Guvern getInstance(String den, Integer nrAngajati){
        if(guvern==null)
            guvern = new Guvern(den,nrAngajati);
        return guvern;
    };
    public void setDen(String den) {
        this.den = den;
    }

    public void setNrAngajati(Integer nrAngajati) {
        this.nrAngajati = nrAngajati;
    }
}
