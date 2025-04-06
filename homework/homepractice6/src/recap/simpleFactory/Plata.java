package recap.simpleFactory;

import recap.prototype.Floare;

public abstract class Plata {
    private Integer valoare;
    private String denumireBeneficiar;
    private String data;

    public abstract void descrierePlata();
}
