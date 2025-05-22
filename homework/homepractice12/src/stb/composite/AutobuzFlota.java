package stb.composite;

public class AutobuzFlota extends AbsAutobuz {
    private String producător;
    private String model;
    private Integer nrLocuri;
    @Override
    public void VizualizareAutobuz() {
        System.out.println("Autobuzul este produs de: " + producător + " model: " + model + " nr de locuri: "+ nrLocuri);
    }

    @Override
    public void adaugaAutobuz(AbsAutobuz autobuz) {

    }

    @Override
    public void stergeAutobuz(AbsAutobuz autobuz) {

    }

    @Override
    public AbsAutobuz getNodCopil(Integer i) {
        return null;
    }

    public AutobuzFlota(String producător, String model, Integer nrLocuri) {
        this.producător = producător;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }
}
