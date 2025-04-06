package seminar6.adapter.clase;

public class MedicamentSpital {

    private String nume;
    private Float pret;


    public void prezintaReteta(){
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("A fost prezentata reteta pentru");
        stringBuilder.append(nume);
        System.out.println(stringBuilder.toString());
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("Medicamentul ");
        stringBuilder.append(nume);
        stringBuilder.append(" costa ");
        stringBuilder.append(pret);
        System.out.println(stringBuilder.toString());
    }

    public MedicamentSpital(String nume, Float pret) {
        this.nume = nume;
        this.pret = pret;
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
}
