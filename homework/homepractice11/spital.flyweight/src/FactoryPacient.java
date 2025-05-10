import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FactoryPacient {
    private HashMap<String,Pacient> hash = new HashMap<>();

    public FactoryPacient() {

    }

    public IFlyweight getItem(String nume, String nrTel, String adresa){
        Pacient pacient = new Pacient(nume,nrTel,adresa);
        if(hash.get(nume)==null){
            hash.put(pacient.getNume(),pacient);
        }
        return hash.get(pacient.getNume());
    }
}
