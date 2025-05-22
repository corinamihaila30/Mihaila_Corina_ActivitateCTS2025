package stb.proxy;

public class Proxy extends Autobuz{
    private Autobuz autobuz;

    @Override
    public void activitateAutobuz() {
        if(autobuz.getNrCalatori()>0){
            autobuz.activitateAutobuz();
        }
        else
            System.out.println("Nu opreste in statie");
    }

    public Proxy(Autobuz autobuz) {
        super(autobuz.getNrCalatori());
        this.autobuz = autobuz;
    }
}
