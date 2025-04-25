package decorator;

public class NotaPlata implements Nota{
    private Float total;
    @Override
    public void printare() {
        System.out.println("Total de plata " + total);
    }

    public NotaPlata(Float total) {
        this.total = total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getTotal() {
        return total;
    }
}
