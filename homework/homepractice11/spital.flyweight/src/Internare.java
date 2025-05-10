public class Internare extends Pacient {
    private Integer nrSalon;
    private Integer nrPat;
    private Integer nrSpitalizare;

    public Internare(Integer nrSalon, Integer nrPat, Integer nrSpitalizare) {
        super();
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrSpitalizare = nrSpitalizare;
    }

    public Integer getNrSalon() {
        return nrSalon;
    }

    public void setNrSalon(Integer nrSalon) {
        this.nrSalon = nrSalon;
    }

    public Integer getNrPat() {
        return nrPat;
    }

    public void setNrPat(Integer nrPat) {
        this.nrPat = nrPat;
    }

    public Integer getNrSpitalizare() {
        return nrSpitalizare;
    }

    public void setNrSpitalizare(Integer nrSpitalizare) {
        this.nrSpitalizare = nrSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare:\n");
        sb.append(" nrSalon: ").append(nrSalon);
        sb.append(", nrPat: ").append(nrPat);
        sb.append(", nrSpitalizare: ").append(nrSpitalizare);
        return sb.toString();
    }
}
