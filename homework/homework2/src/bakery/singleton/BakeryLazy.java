package bakery.singleton;

public class BakeryLazy {
    private String name;
    private String location;
    private Integer numberSweetsTypes;
    private Integer orderMaxCapacity;

    private static BakeryLazy bakery;

    private BakeryLazy(String name, String location, Integer numberSweetsTypes, Integer orderMaxCapacity) {
        this.name = name;
        this.location = location;
        this.numberSweetsTypes = numberSweetsTypes;
        this.orderMaxCapacity = orderMaxCapacity;
    }

    public static BakeryLazy getInstance(){
        if(bakery==null){
            bakery = new BakeryLazy("SweetTooth","New York",123,200);
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
