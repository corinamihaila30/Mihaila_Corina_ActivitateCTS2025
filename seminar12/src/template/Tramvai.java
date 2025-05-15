package template;

public class Tramvai extends TramvaiAbstract {
    private Integer nrTramvai;

    @Override
    protected void opresteStatie1() {
        System.out.println("Tramvaiul " + nrTramvai + " Opreste in statia 1");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("Tramvaiul " + nrTramvai + " Opreste in statia 2");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("Tramvaiul " + nrTramvai + " Opreste in statia 3");
    }

    @Override
    protected void opresteStatie4() {
        System.out.println("Tramvaiul " + nrTramvai + " Opreste in statia 4");
    }

    @Override
    protected void opresteStatie5() {
        System.out.println("Tramvaiul " + nrTramvai + " Opreste in statia 5");
    }

    public Tramvai(Integer nrTramvai) {
        this.nrTramvai = nrTramvai;
    }
}
