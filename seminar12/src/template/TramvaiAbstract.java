package template;

public abstract class TramvaiAbstract {
    protected abstract void opresteStatie1();
    protected abstract void opresteStatie2();
    protected abstract void opresteStatie3();
    protected abstract void opresteStatie4();

    protected abstract void opresteStatie5();
    protected final void parcurgeTur(){
        opresteStatie1();
        opresteStatie2();
        opresteStatie3();
        opresteStatie4();
        opresteStatie5();
    };

     protected final void parcurgeRetur(){
         opresteStatie5();
        opresteStatie4();
        opresteStatie3();
        opresteStatie2();
        opresteStatie1();
    };
}
