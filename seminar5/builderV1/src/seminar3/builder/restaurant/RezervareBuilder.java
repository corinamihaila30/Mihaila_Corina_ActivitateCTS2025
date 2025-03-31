package seminar3.builder.restaurant;

public class RezervareBuilder implements IBuilder{
    private Boolean asezareLaGeam;
    private Boolean scauneERG;
    private Boolean masa;
    private Boolean fmuzica;
    private String numeCurent;

    @Override
    public Rezervare buildRezervare() {
        return new Rezervare(true,true,true,true,"Andrei");
    }

    public IBuilder setAsezareLaGeam(Boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
        return this;
    }

    public IBuilder setScauneERG(Boolean scauneERG) {
        this.scauneERG = scauneERG;
        return this;
    }

    public IBuilder setMasa(Boolean masa) {
        this.masa = masa;
        return this;
    }

    public IBuilder setFmuzica(Boolean fmuzica) {
        this.fmuzica = fmuzica;
        return this;
    }


    public IBuilder setNumeCurent(String numeCurent) {
        this.numeCurent = numeCurent;
        return this;
    }
}
