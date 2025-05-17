package spital.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NotificariSpital {
    private List<Pacient> listaPacienti=new ArrayList<>();
    public abstract void dezbonareSpital(Pacient pacient);
    public abstract void abonareSpital(Pacient pacient);
    public abstract void notificarePacienti();

    public List<Pacient> getListaPacienti() {
        return listaPacienti;
    }


}
