package stb.proxy;

public class AutobuzNoapte extends Autobuz{
    public AutobuzNoapte(Integer nrCalatori) {
        super(nrCalatori);
    }

    @Override
    public void activitateAutobuz() {
        System.out.println("Autobuzul opreste in statie");
    }


}
