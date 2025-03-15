package TourismAgency.factory.packages;

public class AgencyFactory {

    public  static TourismPackage createInstance(String name){
        if(name.equalsIgnoreCase("HOTEL")){
            return new PackageHotel(TourismPackage.types.HOTEL,"London",2000f,20);
        }
        else if(name.equalsIgnoreCase("TRANSPORT")){
            return new PackageHotelTransport(TourismPackage.types.TRANSPORT,"New York",1000f,30);
        }
        return new PackageHotelTransport(TourismPackage.types.HOTEL_TRANSPORT,"Bali",4000f,20);
    }
}
