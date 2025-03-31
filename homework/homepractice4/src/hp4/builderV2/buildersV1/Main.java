package hp4.builderV2.buildersV1;

public class Main {
    public static void main(String[] args) {
        MugHeartShapeBuilder mugHeartShapeBuilder = new MugHeartShapeBuilder(4);
        Mug mug = mugHeartShapeBuilder.setHeartShape(true).setColour("pink").build();
        System.out.println(mug);
    }
}