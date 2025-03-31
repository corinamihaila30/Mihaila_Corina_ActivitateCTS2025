package hp4.builder.mugs;

import hp4.builder.mugs.buildersV1.MugHeartShapeBuilder;
import hp4.builder.mugs.buildersV1.MugPremiumBuilder;

public class MugsClient {
    public static void main(String[] args) {
        MugPremiumBuilder mugPremiumBuilder =  new MugPremiumBuilder(2,"ceramica","rosu");
        Mug mpremium = mugPremiumBuilder.setHeartShape(true).setDiamonds(true).build();
        System.out.println(mpremium);
        MugHeartShapeBuilder mugHeartShapeBuilder = new MugHeartShapeBuilder(10,"ceramica","verde");
        Mug mugMini = mugHeartShapeBuilder.setHeartShape(true).setMini(true).build();
        System.out.println(mugMini);
    }
}