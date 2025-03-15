package bakery.singleton;

public class BakeryThreadSafe {
    private String name;
    private String location;
    private Integer numberSweetsTypes;
    private Integer orderMaxCapacity;

    private static BakeryThreadSafe bakery;

    private BakeryThreadSafe(String name, String location, Integer numberSweetsTypes, Integer orderMaxCapacity) {
        this.name = name;
        this.location = location;
        this.numberSweetsTypes = numberSweetsTypes;
        this.orderMaxCapacity = orderMaxCapacity;
    }

    public static synchronized BakeryThreadSafe getInstance(){
        if(bakery==null){
            bakery = new BakeryThreadSafe("ThreadSweet","Los Angeles",123,200);
        }
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
