package spital.observer;

public class UrgentaVirus extends NotificariSpital {
    private String stare;
    public void modificaStare(String stare){
        this.stare=stare;
    }

    @Override
    public void dezbonareSpital(Pacient pacient) {
        super.getListaPacienti().remove(pacient);
    }

    @Override
    public void abonareSpital(Pacient pacient) {
        super.getListaPacienti().add(pacient);
    }

    @Override
    public void notificarePacienti() {
        System.out.println("Notificare virus Rujeola " + stare);
        for(Pacient p: super.getListaPacienti()){
            p.notificare();
        }
    }

    public UrgentaVirus(String stare) {
        this.stare = stare;
    }
}
