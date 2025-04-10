package spitalA4;

public class Reteta implements IClone {
    private Float cantitateMagneziu;
    private Float cantitateSodiu;
    private Float cantitateATS;

    protected Reteta(Float cantitateMagneziu, Float cantitateSodiu, Float cantitateATS) {
        System.out.println("S-a apelat constr greoi");
        this.cantitateMagneziu = cantitateMagneziu;
        this.cantitateSodiu = cantitateSodiu;
        this.cantitateATS = cantitateATS;
    }

    protected Reteta() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("cantitateMagneziu=").append(cantitateMagneziu);
        sb.append(", cantitateSodiu=").append(cantitateSodiu);
        sb.append(", cantitateATS=").append(cantitateATS);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Reteta clone() {
        Reteta reteta = new Reteta();
        reteta.cantitateATS = this.cantitateATS;
        reteta.cantitateMagneziu = this.cantitateMagneziu;
        reteta.cantitateSodiu = this.cantitateSodiu;
        return reteta;
    }

    public Float getCantitateMagneziu() {
        return cantitateMagneziu;
    }

    public void setCantitateMagneziu(Float cantitateMagneziu) {
        this.cantitateMagneziu = cantitateMagneziu;
    }

    public Float getCantitateSodiu() {
        return cantitateSodiu;
    }

    public void setCantitateSodiu(Float cantitateSodiu) {
        this.cantitateSodiu = cantitateSodiu;
    }

    public Float getCantitateATS() {
        return cantitateATS;
    }

    public void setCantitateATS(Float cantitateATS) {
        this.cantitateATS = cantitateATS;
    }
}
