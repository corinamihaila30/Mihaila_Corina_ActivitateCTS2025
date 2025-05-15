package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class MijlocTransport implements Subiect {
    private Integer nrCalatorii;
    List<ObserverO> lista = new ArrayList<>();
    @Override
    public void adaugaObserver(ObserverO observer) {
        lista.add(observer);
    }

    @Override
    public void stergeObserver(ObserverO observer) {
        lista.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(ObserverO c:lista){
            c.notifica(mesaj);
        }
    }
}
