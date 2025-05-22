package stb.composite;

public abstract class AbsAutobuz {
    public abstract void VizualizareAutobuz();

    public abstract void adaugaAutobuz(AbsAutobuz autobuz);
    public abstract void stergeAutobuz(AbsAutobuz autobuz);
    public abstract AbsAutobuz getNodCopil(Integer i);
}
