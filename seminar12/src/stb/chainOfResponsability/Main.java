package stb.chainOfResponsability;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InfoTransport troleibuz = new InfoTroleibuz();
        InfoTransport tramvai = new InfoTramvai();
        InfoTransport metrou = new InfoMetrou();
        InfoTransport autobuz = new InfoAutobuz();

        troleibuz.setNext(tramvai);
        autobuz.setNext(tramvai);
        tramvai.setNext(metrou);
        troleibuz.stabilesteTransport(20);
    }
}