package reports.companies;

public class Loreal extends Company{
    @Override
    public void calculateEstimativeSales() {
        // TO DO business logic
        Long total = 122000000L;
        System.out.println("Loreal has an estimative sale for next year of" + total);
    }
}
