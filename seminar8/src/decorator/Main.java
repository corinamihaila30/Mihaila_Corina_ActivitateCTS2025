package decorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaPlata(150f);
        Nota notaDec = new NotaAnNou(nota);
        Nota notaCraciun = new NotaCraciun(notaDec);
        notaCraciun.printare();

    }
}