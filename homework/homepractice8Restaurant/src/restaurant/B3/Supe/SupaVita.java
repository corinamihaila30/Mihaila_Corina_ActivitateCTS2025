package restaurant.B3.Supe;

import restaurant.B3.FelDeMancare;

public class SupaVita extends FelDeMancare {

    private Float cantitateVita;
    @Override
    public void descriereFelMancare(){
        System.out.println("Supa contine vita in cantitate de "+cantitateVita);
    };

    public SupaVita(Float cantitateVita) {
        this.cantitateVita = cantitateVita;
    }
}
