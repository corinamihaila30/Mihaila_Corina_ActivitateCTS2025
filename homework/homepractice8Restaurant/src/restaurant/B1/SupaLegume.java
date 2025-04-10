package restaurant.B1;

public class SupaLegume extends Supa {

    private Float cantitateLegume;
    @Override
    public void descriereSupa(){
        System.out.println("Supa contine un numar de " + cantitateLegume + " legume");
    };

    public SupaLegume(Float cantitateLegume) {
        this.cantitateLegume = cantitateLegume;
    }
}
