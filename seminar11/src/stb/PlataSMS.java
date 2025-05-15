package stb;

public class PlataSMS implements Plata {
    @Override
    public void efectuarePlata(Float pretBilet) {
        System.out.println("Plata se face prin SMS");
    }
}
