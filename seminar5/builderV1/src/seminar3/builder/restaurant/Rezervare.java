package seminar3.builder.restaurant;

public class Rezervare {
    private Boolean asezareLaGeam;
    private Boolean scauneERG;
    private Boolean masa;
    private Boolean fmuzica;
    private String numeCurent;

    protected Rezervare(Boolean asezareLaGeam, Boolean scauneERG, Boolean masa, Boolean fmuzica, String numeCurent) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneERG = scauneERG;
        this.masa = masa;
        this.fmuzica = fmuzica;
        this.numeCurent = numeCurent;
    }

    public void setAsezareLaGeam(Boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public void setScauneERG(Boolean scauneERG) {
        this.scauneERG = scauneERG;
    }

    public void setMasa(Boolean masa) {
        this.masa = masa;
    }

    public void setFmuzica(Boolean fmuzica) {
        this.fmuzica = fmuzica;
    }

    public void setNumeCurent(String numeCurent) {
        this.numeCurent = numeCurent;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "asezareLaGeam=" + asezareLaGeam +
                ", scauneERG=" + scauneERG +
                ", masa=" + masa +
                ", fmuzica=" + fmuzica +
                ", numeCurent='" + numeCurent + '\'' +
                '}';
    }
}
