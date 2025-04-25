package recap.patterns.singletonSiFactory;

import recap.patterns.singletonSiFactory.enums.DesertEnum;
import recap.patterns.singletonSiFactory.enums.FelMancareEnum;
import recap.patterns.singletonSiFactory.tipurimancare.Clatite;
import recap.patterns.singletonSiFactory.tipurimancare.FelDeMancare;
import recap.patterns.singletonSiFactory.tipurimancare.LavaCake;

public class DesertFactory implements IFactory{
    private static DesertFactory desertFactory;


    private DesertFactory() {
    }

    public static synchronized DesertFactory getInstance(){
        if(desertFactory==null)
            desertFactory=new DesertFactory();
        return desertFactory;
    };

    @Override
    public FelDeMancare getFelMancare(FelMancareEnum tip,Float cantitate,Float pret) {
        DesertEnum desert = (DesertEnum) tip;
        switch (desert){
            case LAVA_CAKE -> {
                return new LavaCake(cantitate,pret);
            }
            case CLATITE -> {
                return new Clatite(cantitate,pret);
            }
            default -> {
                return null;
            }
        }
    }
}
