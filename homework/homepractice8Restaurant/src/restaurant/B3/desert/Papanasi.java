package restaurant.B3.desert;

import restaurant.B3.FelDeMancare;

public class Papanasi extends FelDeMancare {
    private Float cantitateGem;
    @Override
    public void descriereFelMancare() {
        System.out.println("Canitatea de gem de pe papanasi este de" + cantitateGem);
    }

    public Papanasi(Float cantitateGem) {
        this.cantitateGem = cantitateGem;
    }
}
