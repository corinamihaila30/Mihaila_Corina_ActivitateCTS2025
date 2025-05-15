package stb;

public class PlataCard  implements Plata {
    private Float sold;
    @Override
    public void efectuarePlata(Float pretBilet) {
        if(sold>=pretBilet){
            sold = sold-pretBilet;
            System.out.println("Plata cu cardul bancar s-a realizat cu succes");
        }
        else{
            System.out.println("Plata cu cardul bancar nu s-a realizat");
        }
    }
}
