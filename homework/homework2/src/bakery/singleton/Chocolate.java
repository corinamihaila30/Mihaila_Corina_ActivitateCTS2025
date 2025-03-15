package bakery.singleton;

public class Chocolate extends Sweet{
    private String flavour;
    private String extras;

    public Chocolate(String code, String flavour, String extras) {
        super(code);
        this.flavour = flavour;
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "flavour='" + flavour + '\'' +
                ", extras='" + extras + '\'' +
                "} " + super.toString();
    }
}
