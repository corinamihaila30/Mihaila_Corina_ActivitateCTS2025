package recap.patterns.builder;

public class Hanorac {
    private String culoare;
    private Float pret;
    private Boolean isPersonalized;
    private Boolean hasDetails;

    public Hanorac(String culoare, Float pret, Boolean isPersonalized, Boolean hasDetails) {
        this.culoare = culoare;
        this.pret = pret;
        this.isPersonalized = isPersonalized;
        this.hasDetails = hasDetails;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hanorac{");
        sb.append("culoare='").append(culoare).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", isPersonalized=").append(isPersonalized);
        sb.append(", hasDetails=").append(hasDetails);
        sb.append('}');
        return sb.toString();
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setPret(Float pret) {
        this.pret = pret;
    }

    public void setPersonalized(Boolean personalized) {
        isPersonalized = personalized;
    }

    public void setHasDetails(Boolean hasDetails) {
        this.hasDetails = hasDetails;
    }

}
