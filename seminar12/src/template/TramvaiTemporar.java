package template;

public class TramvaiTemporar extends TramvaiAbstract{
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
        System.out.println("Tramvaiul " + nrTramvai + " nu opreste in statia 3 pentru ca se lucreaza");
    }

    @Override
    protected void opresteStatie4() {
        System.out.println("Tramvaiul " + nrTramvai + " Opreste in statia 4");
    }

    @Override
    protected void opresteStatie5() {
        System.out.println("Tramvaiul " + nrTramvai + " nu opreste in statia 5 pt ca se lucreaza");
    }

}
