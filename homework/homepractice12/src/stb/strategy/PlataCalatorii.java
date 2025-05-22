package stb.strategy;

public class PlataCalatorii  extends Plata{
    private Integer nrCalatorii;
    @Override
    public void efectuarePlata() {
        if (nrCalatorii>0){
            System.out.println("S-a facut plata cu un card de calatorii");
        }
        else {
            System.out.println("Nu mai sunt calatorii ramase");
        }
    }

    public PlataCalatorii(Integer nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }
}
