package recap.FactoryMethod.PlataUlterior;

public class PlataTransferBancar extends PlataUlterior{
    @Override
    public void descrierePlata() {
        System.out.println("Plata va fi facuta ulterior prin transfer bancar");
    }

    public PlataTransferBancar() {
        super();
    }
}
