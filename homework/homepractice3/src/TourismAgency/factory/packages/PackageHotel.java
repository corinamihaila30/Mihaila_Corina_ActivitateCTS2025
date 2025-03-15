package TourismAgency.factory.packages;

public class PackageHotel extends TourismPackage {

    public PackageHotel(types type, String locationName, Float price, Integer maximumTouristCapacity) {
        super(type, locationName, price, maximumTouristCapacity);
    }

    @Override
    public Float calculateDiscount() {
        float discount = 0.1f;
        float totalDiscount = discount*super.getPrice();
        float discountTotal = super.getPrice() - totalDiscount;
        return discountTotal;
    }

    @Override
    public String toString() {
        return "PackageHotel{} " + super.toString();
    }
}
