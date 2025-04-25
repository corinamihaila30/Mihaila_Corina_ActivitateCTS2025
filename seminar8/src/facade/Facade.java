package facade;

public class Facade {
    public String verificaAsezareMasa(Masa masa){
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();
        if(picolo.debaraseaza(masa)){
            if(ospatar.esteAranjata(masa)){
                return "Masa este gata"+ masa.getNrMasa();
            }
        }else {
            return "Asteptati";
        }
        return "Nu sunt mese libere";
    }
}
