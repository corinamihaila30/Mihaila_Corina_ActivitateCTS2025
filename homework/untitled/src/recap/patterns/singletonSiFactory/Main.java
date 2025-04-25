package recap.patterns.singletonSiFactory;

import recap.patterns.singletonSiFactory.enums.DesertEnum;
import recap.patterns.singletonSiFactory.enums.FelMancareEnum;
import recap.patterns.singletonSiFactory.enums.SupeEnum;
import recap.patterns.singletonSiFactory.tipurimancare.FelDeMancare;
import recap.patterns.singletonSiFactory.tipurimancare.SupaLegume;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IFactory desertFactory = DesertFactory.getInstance();
        IFactory desertFactory2 = DesertFactory.getInstance();
        FelDeMancare clatita = desertFactory.getFelMancare(DesertEnum.CLATITE,200f,30.5f);
        FelDeMancare lavaCake = desertFactory2.getFelMancare(DesertEnum.LAVA_CAKE,200f,30f);
        clatita.descriereProdus();
        lavaCake.descriereProdus();
    }
}