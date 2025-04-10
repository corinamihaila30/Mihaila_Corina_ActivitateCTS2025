package restaurant.B1;

public class SupaCiuperci extends Supa {

    private Float cantitateCiuperci;
    @Override
    public void descriereSupa(){
        System.out.println("Supa contine un numar de " + cantitateCiuperci + " ciuperci");
    };

    public SupaCiuperci(Float cantitateCiuperci) {
        this.cantitateCiuperci = cantitateCiuperci;
    }
}
