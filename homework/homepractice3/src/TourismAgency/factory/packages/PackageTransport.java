package TourismAgency.factory.packages;

public class PackageTransport extends TourismPackage{

    public PackageTransport(types type, String locationName, Float price, Integer maximumTouristCapacity) {
        super(type, locationName, price, maximumTouristCapacity);
    }

    @Override
    public Float calculateDiscount() {
        float discount = 0;
        float totalDiscount = discount*super.getPrice();
        float discountTotal = super.getPrice() - totalDiscount;
        return discountTotal;
    }
}
