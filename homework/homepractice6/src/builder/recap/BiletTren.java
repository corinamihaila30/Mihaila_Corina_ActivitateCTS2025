package builder.recap;

import javax.swing.text.StyledEditorKit;

public class BiletTren {
    private String destinatie;
    private Integer pret;
    private Boolean clasa1;
    private Boolean masaInlcusa;
    private Boolean wifi;

    private BiletTren(String destinatie, Integer pret, Boolean clasa1, Boolean masaInlcusa, Boolean wifi) {
        this.destinatie = destinatie;
        this.pret = pret;
        this.clasa1 = clasa1;
        this.masaInlcusa = masaInlcusa;
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BiletTren{");
        sb.append("destinatie='").append(destinatie).append('\'');
        sb.append(", pret='").append(pret).append('\'');
        sb.append(", clasa1=").append(clasa1);
        sb.append(", masaInlcusa=").append(masaInlcusa);
        sb.append(", wifi=").append(wifi);
        sb.append('}');
        return sb.toString();
    }

    private void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    private void setPret(Integer pret) {
        this.pret = pret;
    }

    private void setClasa1(Boolean clasa1) {
        this.clasa1 = clasa1;
    }

    private void setMasaInlcusa(Boolean masaInlcusa) {
        this.masaInlcusa = masaInlcusa;
    }

    private void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

     public static class TrenBuilder implements IBuilder{

        private String destinatie;
        private Integer pret;
        private Boolean clasa1;
        private Boolean masaInlcusa;
        private Boolean wifi;

        public TrenBuilder(String destinatie,Integer pret) {
            this.destinatie = destinatie;
            this.pret = pret;
            this.clasa1 = false;
            this.masaInlcusa = false;
            this.wifi = false;
        }

        @Override
        public BiletTren build() {
            return new BiletTren(destinatie,pret,clasa1,masaInlcusa,wifi);
        }

        public TrenBuilder addMasaInlcusa(Boolean masaInlcusa) {
            this.masaInlcusa = masaInlcusa;
            return this;
        }

        public TrenBuilder addClasa1(Boolean clasa1) {
            this.clasa1 = clasa1;
            return this;
        }

        public TrenBuilder addWifi(Boolean wifi) {
            this.wifi = wifi;
            return this;
        }
    }
}
