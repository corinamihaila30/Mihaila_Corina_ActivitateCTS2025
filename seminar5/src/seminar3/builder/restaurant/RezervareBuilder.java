package seminar3.builder.restaurant;

public class RezervareBuilder implements AbstractBuilder{
    private Rezervare rezervare;

    public RezervareBuilder(String nume) {
        rezervare = new Rezervare(false,false,false,false,nume);
    }


    @Override
    public Rezervare buildRezervare() {
        return rezervare;
    }

    @Override
    public AbstractBuilder setAsezareLaGeam(Boolean asezareLaGeam) {
        rezervare.setAsezareLaGeam(asezareLaGeam);
        return this;
    }

    @Override
    public AbstractBuilder setScauneERG(Boolean scauneERG) {
        rezervare.setScauneERG(scauneERG);
        return this;
    }

    @Override
    public AbstractBuilder setMasa(Boolean masa) {
        rezervare.setMasa(masa);
        return this;
    }

    @Override
    public AbstractBuilder setFmuzica(Boolean fmuzica) {
        rezervare.setFmuzica(fmuzica);
        return this;
    }

    @Override
    public AbstractBuilder setNumeCurent(String numeCurent) {
        rezervare.setNumeCurent(numeCurent);
        return this;
    }
}
