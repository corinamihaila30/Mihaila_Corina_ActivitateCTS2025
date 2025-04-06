package recap.builder;

public class Mug {
    private String material;
    private Float pret;
    private Boolean isHeartShaped;
    private String culoare;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mug{");
        sb.append("material='").append(material).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", isHeartShaped=").append(isHeartShaped);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Float getPret() {
        return pret;
    }

    public void setPret(Float pret) {
        this.pret = pret;
    }

    public Boolean getHeartShaped() {
        return isHeartShaped;
    }

    public void setHeartShaped(Boolean heartShaped) {
        isHeartShaped = heartShaped;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Mug(String material, Float pret, Boolean isHeartShaped, String culoare) {
        this.material = material;
        this.pret = pret;
        this.isHeartShaped = isHeartShaped;
        this.culoare = culoare;
    }
}
