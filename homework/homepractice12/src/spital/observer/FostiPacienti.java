package spital.observer;

import javax.swing.*;

public class FostiPacienti implements Pacient {
    private String numePacient;
    @Override
    public void notificare() {
            System.out.println(numePacient+ " a fost notificat.");
    }

    public FostiPacienti(String numePacient) {
        this.numePacient = numePacient;
    }
}
