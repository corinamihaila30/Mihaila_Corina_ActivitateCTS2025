package restaurant.B1;

public class SupaVita extends Supa {

    private Float cantitateVita;
    @Override
    public void descriereSupa(){
        System.out.println("Supa contine vita in cantitate de "+cantitateVita);
    };

    public SupaVita(Float cantitateVita) {
        this.cantitateVita = cantitateVita;
    }
}
