package facade;

import javax.swing.text.StyledEditorKit;

public class Picolo {
    public Boolean debaraseaza(Masa masa){
        return masa.getNrMasa()%2==0;
    }
}
