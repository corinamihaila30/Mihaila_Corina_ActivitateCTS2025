package stb.chainOfResponsability;

public abstract class InfoTransport {
    private InfoTransport next;
    public abstract void stabilesteTransport(Integer distanta);

    public void setNext(InfoTransport next) {
        this.next = next;
    }

    protected InfoTransport getNext() {
        return next;
    }

}
