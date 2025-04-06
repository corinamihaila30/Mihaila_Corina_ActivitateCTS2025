package spitalA2.angajati;

public class PersonalSpital {
    protected String nume;
    protected Float salariu;
    protected String hasContractPermanent;

    public PersonalSpital(String nume, Float salariu, String hasContractPermanent) {
        this.nume = nume;
        this.salariu = salariu;
        this.hasContractPermanent = hasContractPermanent;
    }

    public PersonalSpital() {
    }

    public void descriereAtributii(){
        System.out.println("Fac parte din personalul spitalului");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append(", hasContractPermanent='").append(hasContractPermanent).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
