package reports.companies;

public class Atlas extends Company{
    public Atlas() {
        super();
    }

    @Override
    public void calculateEstimativeSales() {
        // TO DO business logic
        Long total = 12000000L;
        System.out.println("Atlas has an estimative sale for next year of" + total);
    }

    public Atlas(String name, Integer id, Float years, Float loses) {
        super(name,id,years,loses);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atlas{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append(", expertiseYears=").append(expertiseYears);
        sb.append(", amountOfLoses=").append(amountOfLoses);
        sb.append('}');
        return sb.toString();
    }
}
