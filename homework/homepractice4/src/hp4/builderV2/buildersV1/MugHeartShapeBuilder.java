package hp4.builderV2.buildersV1;


public class MugHeartShapeBuilder implements iBuilder {
    private Integer id;
    private String material;
    private String colour;
    private Boolean diamonds;
    private Boolean heartShape;
    private Boolean mini;
    @Override
    public Mug build() {
        return new Mug(id, material,colour,diamonds,heartShape,mini);
    }

    public MugHeartShapeBuilder(Integer id) {
        this.id = id;
        this.colour = "white";
        this.material="ceramica";

    }

    public MugHeartShapeBuilder setId(Integer id) {
        this.id =id;
        return this;
    }

    public MugHeartShapeBuilder setMaterial(String material) {
       this.material = material;
        return this;
    }

    public MugHeartShapeBuilder setColour(String colour) {
        this.colour = material;
        return this;
    }

    public MugHeartShapeBuilder setDiamonds(Boolean diamonds) {
        this.diamonds = diamonds;
        return this;
    }

    public MugHeartShapeBuilder setHeartShape(Boolean heartShape) {
        this.heartShape = heartShape;
        return this;
    }

    public MugHeartShapeBuilder setMini(Boolean mini) {
        this.mini = mini;
        return this;
    }
}
