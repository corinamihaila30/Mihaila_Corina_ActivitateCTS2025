package recap.patterns.builder;

public class HanoracBuilder implements IBuilder {
    private String culoare;
    private Float pret;
    private Boolean isPersonalized;
    private Boolean hasDetails;

    public HanoracBuilder(String culoare, Float pret) {
        this.culoare = culoare;
        this.pret = pret;
        this.isPersonalized = false;
        this.hasDetails = false;
    }

    @Override
    public Hanorac build() {
        return new Hanorac(culoare,pret,isPersonalized,hasDetails);
    }

    public HanoracBuilder addDetails(Boolean hasDetails) {
        this.hasDetails = hasDetails;
        return this;
    }
    public HanoracBuilder addIsPersonalized(Boolean isPersonalized) {
        this.isPersonalized = isPersonalized;
        return this;
    }
}
