package recap.simpleFactory;

public class PlataUlterior extends Plata{
    public PlataUlterior() {
        super();
    }

    public void descrierePlata(){
        System.out.println("Tranzactia se va efectua ulterior prin transfer bancar sau rate");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlataUlterior{");
        sb.append('}');
        return sb.toString();
    }
}
