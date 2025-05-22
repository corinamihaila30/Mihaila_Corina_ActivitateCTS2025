package stb.template;

public abstract class MijlocTransport {
    public abstract void opresteStatia1();
    public abstract void opresteStatia2();
    public abstract void opresteStatia3();
    public abstract void opresteStatia4();

    protected final void parcurgeDus(){
        opresteStatia1();
        opresteStatia2();
        opresteStatia3();
        opresteStatia4();
    };

    protected final void parcurgeSensInvers(){
        opresteStatia4();
        opresteStatia3();
        opresteStatia2();
        opresteStatia1();
    };
}
