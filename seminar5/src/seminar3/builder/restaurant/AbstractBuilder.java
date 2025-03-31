package seminar3.builder.restaurant;

public interface AbstractBuilder {
    Rezervare buildRezervare();

    AbstractBuilder setAsezareLaGeam(Boolean asezareLaGeam);
    AbstractBuilder setScauneERG(Boolean scauneERG);
    AbstractBuilder setMasa(Boolean masa);
    AbstractBuilder setFmuzica(Boolean fmuzica);

    AbstractBuilder setNumeCurent(String numeCurent);
}
