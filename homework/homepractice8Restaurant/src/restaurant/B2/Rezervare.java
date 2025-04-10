package restaurant.B2;

public class Rezervare {
    private String nume;
    private Integer nrPersoane;
    private Boolean asezareGeam;
    private Boolean scauneErgonomice;
    private Boolean decorMasa;
    private Boolean muzicsAmbientala;
    private Boolean genMuzica;


    private Rezervare(String nume, Integer nrPersoane, Boolean asezareGeam, Boolean scauneErgonomice, Boolean decorMasa, Boolean muzicsAmbientala, Boolean genMuzica) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorMasa = decorMasa;
        this.muzicsAmbientala = muzicsAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorMasa=").append(decorMasa);
        sb.append(", muzicsAmbientala=").append(muzicsAmbientala);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }

    public static class RezervareBuilder implements IBuilder {

        private String nume;
        private Integer nrPersoane;
        private Boolean asezareGeam;
        private Boolean scauneErgonomice;
        private Boolean decorMasa;
        private Boolean muzicaAmbientala;
        private Boolean genMuzica;

        public RezervareBuilder(String nume) {
            this.nume = nume;
            this.asezareGeam=false;
            this.decorMasa=false;
            this.scauneErgonomice=false;
            this.muzicaAmbientala=false;
            this.genMuzica=false;
        }

        @Override
        public Rezervare build() {
            Rezervare rezervare = new Rezervare(nume,nrPersoane,asezareGeam,scauneErgonomice,decorMasa,muzicaAmbientala,genMuzica);
            return rezervare;
        }


        public RezervareBuilder addAsezareLaGeam(Boolean asezareGeam) {
            this.asezareGeam = asezareGeam;
            return this;
        }

        public RezervareBuilder addNrPersoane(Integer nrPersoane) {
            this.nrPersoane = nrPersoane;
            return this;
        }

        public RezervareBuilder addScaun(Boolean scauneErgonomice) {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }

        public RezervareBuilder addDecorMasa(Boolean decorMasa) {
            this.decorMasa = decorMasa;
            return this;
        }

        public RezervareBuilder addMuzicaAmbientala(Boolean muzicaAmbientala) {
            this.muzicaAmbientala = muzicaAmbientala;
            return this;
        }

        public RezervareBuilder addGenMuzica(Boolean genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }
    }


}
