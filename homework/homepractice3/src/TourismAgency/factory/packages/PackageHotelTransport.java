package TourismAgency.factory.packages;

public class PackageHotelTransport extends TourismPackage {

    public PackageHotelTransport(types type, String locationName, Float price, Integer maximumTouristCapacity) {
        super(type, locationName, price, maximumTouristCapacity);
    }

    @Override
    public Float calculateDiscount() {
        float discount = 0.5f;
        float totalDiscount = discount*super.getPrice();
        float discountTotal = super.getPrice() - totalDiscount;
        return discountTotal;
    }
}
