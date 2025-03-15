package bakery.singleton;

public class BakeryEager {
    private String name;
    private String location;
    private Integer numberSweetsTypes;
    private Integer orderMaxCapacity;

    private static BakeryEager bakery = new BakeryEager("Sweets paradise","London",123,200);

    private BakeryEager(String name, String location, Integer numberSweetsTypes, Integer orderMaxCapacity) {
        this.name = name;
        this.location = location;
        this.numberSweetsTypes = numberSweetsTypes;
        this.orderMaxCapacity = orderMaxCapacity;
    }

    public static BakeryEager getInstance(){
        return bakery;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BakeryEager{");
        sb.append("name='").append(name).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", numberSweetsTypes=").append(numberSweetsTypes);
        sb.append(", orderMaxCapacity=").append(orderMaxCapacity);
        sb.append('}');
        return sb.toString();
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
