package spital.facade;

public class Salon {
    private Integer idSalon;
    private Integer nrLocuri;

    public Boolean existaLocLiber(){
        if (nrLocuri>=1){
            return true;
        }
        return false;
    }

    public Salon(Integer idSalon, Integer nrLocuri) {
        this.idSalon = idSalon;
        this.nrLocuri = nrLocuri;
    }
}
