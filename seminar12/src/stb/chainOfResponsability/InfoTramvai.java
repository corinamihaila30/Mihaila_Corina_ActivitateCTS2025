package stb.chainOfResponsability;

public class InfoTramvai extends InfoTransport {

    @Override
    public void stabilesteTransport(Integer distanta) {
        if(distanta<10){
            System.out.println("Va recomandam sa luati troleibuzul");
        }
        else {
            super.getNext().stabilesteTransport(distanta);
        }
    }
}
