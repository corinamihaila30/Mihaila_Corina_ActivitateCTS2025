package hp4.builder.mugs.buildersV1;

import hp4.builder.mugs.Mug;

public class MugPremiumBuilder implements iBuilder{
    private Mug mug;

    public MugPremiumBuilder(Integer id, String material, String colour) {
        mug = new Mug(id,material,colour,false,false,false);;
    }

    @Override
    public Mug build() {
        return mug;
    }
    public MugPremiumBuilder setId(Integer id) {
         this.mug.setId(id);
         return this;
    }

    public MugPremiumBuilder setMaterial(String material) {
        this.mug.setMaterial(material);
        return this;
    }

    public MugPremiumBuilder setColour(String colour) {
        this.mug.setColour(colour);
        return this;
    }

    public MugPremiumBuilder setDiamonds(Boolean diamonds) {
        this.mug.setDiamonds(diamonds);
        return this;
    }

    public MugPremiumBuilder setHeartShape(Boolean heartShape) {
        this.mug.setHeartShape(heartShape);
        return this;
    }

    public MugPremiumBuilder setMini(Boolean mini) {
        this.mug.setMini(mini);
        return this;
    }


}
