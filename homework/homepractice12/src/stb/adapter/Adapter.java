package stb.adapter;

public class Adapter implements SoftTransportSubteran {
    private SoftTransportTerestru softTransportTerestru;

    public Adapter(SoftTransportTerestru softTransportTerestru) {
        this.softTransportTerestru = softTransportTerestru;
    }

    @Override
    public void validareCalatorie() {
        if(softTransportTerestru.getValidatAnterior()==false && softTransportTerestru.getNrCalatorii()>=1){
            System.out.println("Biletul/Abonamentul poate fi utilizat");
        }
        else {
            System.out.println("Nu mai poate fi utilizat acest abonament/bilet");
        }


    }
}
