package recap.patterns.Proto;

public class Elicopter implements IClone {
    private String brand;
    private Integer pret;

    protected Elicopter(String brand, Integer pret) {
        System.out.println("Constructor care dureaza mult");
        this.brand = brand;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elicopter{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    private Elicopter() {
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    @Override
    public Elicopter cloneaza() {
        Elicopter elicopter = new Elicopter();
        elicopter.brand = brand;
        elicopter.pret=pret;
        return elicopter;
    }
}
