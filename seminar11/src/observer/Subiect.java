package observer;

import java.util.Observer;

public interface Subiect {
    void adaugaObserver(ObserverO observer);
    void stergeObserver(ObserverO observer);
    void trimiteMesaj(String mesaj);

}
