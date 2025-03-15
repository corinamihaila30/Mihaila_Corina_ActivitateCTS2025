package reports.companies;

public abstract class Company {
    public String name;
    public Integer id;

    public Float expertiseYears;
    public Float amountOfLoses;

    public abstract void calculateEstimativeSales();

    public Company(String name, Integer id, Float expertiseYears, Float amountOfLoses) {
        this.name = name;
        this.id = id;
        this.expertiseYears = expertiseYears;
        this.amountOfLoses = amountOfLoses;
    }

    public Company() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setExpertiseYears(Float expertiseYears) {
        this.expertiseYears = expertiseYears;
    }

    public void setAmountOfLoses(Float amountOfLoses) {
        this.amountOfLoses = amountOfLoses;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Float getExpertiseYears() {
        return expertiseYears;
    }

    public Float getAmountOfLoses() {
        return amountOfLoses;
    }
}
