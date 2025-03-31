package hp4.builderV2.buildersV1;

public class Mug {
    private Integer id;
    private String material;
    private String colour;
    private Boolean diamonds;
    private Boolean heartShape;
    private Boolean mini;

    public Mug(Integer id, String material, String colour, Boolean diamonds, Boolean heartShape, Boolean mini) {
        this.id = id;
        this.material = material;
        this.colour = colour;
        this.diamonds = diamonds;
        this.heartShape = heartShape;
        this.mini = mini;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mug{");
        sb.append("id=").append(id);
        sb.append(", material='").append(material).append('\'');
        sb.append(", colour='").append(colour).append('\'');
        sb.append(", diamonds=").append(diamonds);
        sb.append(", heartShape=").append(heartShape);
        sb.append(", mini=").append(mini);
        sb.append('}');
        return sb.toString();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDiamonds(Boolean diamonds) {
        this.diamonds = diamonds;
    }

    public void setHeartShape(Boolean heartShape) {
        this.heartShape = heartShape;
    }

    public void setMini(Boolean mini) {
        this.mini = mini;
    }


}
