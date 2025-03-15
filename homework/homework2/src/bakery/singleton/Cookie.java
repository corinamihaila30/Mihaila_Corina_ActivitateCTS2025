package bakery.singleton;

public class Cookie extends Sweet {
    private String name;
    private String topping;

    public Cookie(String code, String name, String topping) {
        super(code);
        this.name = name;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "name='" + name + '\'' +
                ", topping='" + topping + '\'' +
                "} " + super.toString();
    }
}
