package decorator;

public abstract class NotaDecorator implements Nota {
    private Nota nota;
   public void printare(){
       nota.printare();
       printareFelicitare();
   };

    public NotaDecorator(Nota nota) {
        this.nota = nota;
    }

    protected abstract void printareFelicitare();
}
