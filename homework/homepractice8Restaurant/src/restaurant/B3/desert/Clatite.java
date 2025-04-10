package restaurant.B3.desert;

import restaurant.B3.FelDeMancare;

public class Clatite extends FelDeMancare {
    private Float cantitateNutella;
    @Override
    public void descriereFelMancare() {
        System.out.println("Canitatea de Nutella din clatite este de" + cantitateNutella);
    }

    public Clatite(Float cantitateNutella) {
        this.cantitateNutella = cantitateNutella;
    }
}
