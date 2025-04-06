package recap.prototype;

public class Floare implements IClone{
    private String denumire;
    private String culoare;
    public Floare(String denumire, String culoare) {
        System.out.println("dureaza mult");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException ie){
            System.out.println("ddd");
        }
        this.denumire = denumire;
        this.culoare = culoare;
    }

    private Floare(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Floare{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public Floare cloneFloare() {
        Floare floare1 = new Floare();
        floare1.setCuloare(this.getCuloare());
        floare1.setDenumire(this.getDenumire());
        return floare1;
    }
}
