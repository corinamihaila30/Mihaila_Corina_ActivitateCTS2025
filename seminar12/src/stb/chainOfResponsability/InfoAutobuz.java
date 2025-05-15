package stb.chainOfResponsability;

public class InfoAutobuz extends InfoTransport{
    @Override
    public void stabilesteTransport(Integer distanta) {
        if(distanta<5){
            System.out.println("Va recomandam sa luati autobuz");
        }
        else {
            super.getNext().stabilesteTransport(distanta);
        }
    }
}
