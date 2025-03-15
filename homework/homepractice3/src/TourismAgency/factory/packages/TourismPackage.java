package TourismAgency.factory.packages;

public abstract class TourismPackage {

    private types type;
    private String locationName;
    private Float price;
    private Integer maximumTouristCapacity;


    public TourismPackage(types type, String locationName, Float price, Integer maximumTouristCapacity) {
        this.type = type;
        this.locationName = locationName;
        this.price = price;
        this.maximumTouristCapacity = maximumTouristCapacity;
    }

    public abstract Float calculateDiscount();

    @Override
    public String toString() {
        return "TourismPackage{" +
                "type=" + type +
                ", locationName='" + locationName + '\'' +
                ", price=" + price +
                ", maximumTouristCapacity=" + maximumTouristCapacity +
                '}';
    }

    public Float getPrice() {
        return price;
    }

    enum types {
        HOTEL,
        TRANSPORT,
        HOTEL_TRANSPORT
    }
}
