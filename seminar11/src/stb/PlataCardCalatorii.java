package stb;

public class PlataCardCalatorii implements Plata{
    private Integer nrCalatorii;

    public PlataCardCalatorii(Integer nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void efectuarePlata(Float pretBilet) {
        if(nrCalatorii>0){
            nrCalatorii--;
            System.out.println("S-a achitat calatoria folosind cardul de calatorii");
        }
    }
}
