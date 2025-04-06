package seminar6.adapter.clase;

public class MedicamentFarmacie {

    private String nume;
    private Float pret;
    private Boolean esteStoc;
    public void cumparaMedicament(){
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("Medicamentul ");
        stringBuilder.append(nume);
        stringBuilder.append(" costa ");
        stringBuilder.append(pret);
        System.out.println(stringBuilder.toString());
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Float getPret() {
        return pret;
    }

    public void setPret(Float pret) {
        this.pret = pret;
    }

    public Boolean getEsteStoc() {
        return esteStoc;
    }

    public void setEsteStoc(Boolean esteStoc) {
        this.esteStoc = esteStoc;
    }

    public MedicamentFarmacie(String nume, Float pret, Boolean esteStoc) {
        this.nume = nume;
        this.pret = pret;
        this.esteStoc = esteStoc;
    }
}
