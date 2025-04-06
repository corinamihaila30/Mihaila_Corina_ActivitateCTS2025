package recap.builder;

public class MugBuilder implements IBuilder{
    private String material;
    private Float pret;
    private Boolean isHeartShaped;
    private String culoare;
    @Override
    public Mug build() {
        return new Mug(material,pret,isHeartShaped,culoare);
    }

    public MugBuilder addPret(Float pret){
        this.pret = pret;
        return this;
    }

}
