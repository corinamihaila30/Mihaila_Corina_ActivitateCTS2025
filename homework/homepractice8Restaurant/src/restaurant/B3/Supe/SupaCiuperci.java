package restaurant.B3.Supe;

import restaurant.B3.FelDeMancare;

public class SupaCiuperci extends FelDeMancare {

    private Float cantitateCiuperci;
    @Override
    public void descriereFelMancare(){
        System.out.println("Supa contine un numar de " + cantitateCiuperci + " ciuperci");
    };

    public SupaCiuperci(Float cantitateCiuperci) {
        this.cantitateCiuperci = cantitateCiuperci;
    }
}
