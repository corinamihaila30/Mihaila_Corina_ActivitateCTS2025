package restaurant.B3.Supe;

import restaurant.B3.FelDeMancare;

public class SupaLegume extends FelDeMancare {

    private Float cantitateLegume;
    @Override
    public void descriereFelMancare(){
        System.out.println("Supa contine un numar de " + cantitateLegume + " legume");
    };

    public SupaLegume(Float cantitateLegume) {
        this.cantitateLegume = cantitateLegume;
    }
}
