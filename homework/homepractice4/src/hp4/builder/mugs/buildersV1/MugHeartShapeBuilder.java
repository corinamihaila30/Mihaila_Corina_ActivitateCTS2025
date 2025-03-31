package hp4.builder.mugs.buildersV1;

import hp4.builder.mugs.Mug;

public class MugHeartShapeBuilder implements iBuilder{
    private final Mug mug;
    @Override
    public Mug build() {
        return mug;
    }

    public MugHeartShapeBuilder(Integer id, String material, String colour) {
        mug = new Mug(id,material,colour,false,true,false);
    }

    public MugHeartShapeBuilder setId(Integer id) {
        this.mug.setId(id);
        return this;
    }

    public MugHeartShapeBuilder setMaterial(String material) {
        this.mug.setMaterial(material);
        return this;
    }

    public MugHeartShapeBuilder setColour(String colour) {
        this.mug.setColour(colour);
        return this;
    }

    public MugHeartShapeBuilder setDiamonds(Boolean diamonds) {
        this.mug.setDiamonds(diamonds);
        return this;
    }

    public MugHeartShapeBuilder setHeartShape(Boolean heartShape) {
        this.mug.setHeartShape(heartShape);
        return this;
    }

    public MugHeartShapeBuilder setMini(Boolean mini) {
        this.mug.setMini(mini);
        return this;
    }
}
