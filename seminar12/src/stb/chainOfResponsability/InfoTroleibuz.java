package stb.chainOfResponsability;

public class InfoTroleibuz extends InfoTransport{

    @Override
    public void stabilesteTransport(Integer distanta) {
        if(distanta<3){
            System.out.println("Va recomandam sa luati troleibuzul");
        }
        else {
            super.getNext().stabilesteTransport(distanta);
        }
    }
}
