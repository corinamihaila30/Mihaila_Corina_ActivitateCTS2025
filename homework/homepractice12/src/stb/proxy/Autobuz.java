package stb.proxy;

public abstract class Autobuz {
    private Integer nrCalatori;
    public abstract void activitateAutobuz();
    public Integer getNrCalatori() {
        return nrCalatori;
    }

    public Autobuz(Integer nrCalatori) {
        this.nrCalatori = nrCalatori;
    }
}
