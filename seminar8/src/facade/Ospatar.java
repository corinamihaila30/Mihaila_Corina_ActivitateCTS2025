package facade;

import javax.swing.text.StyledEditorKit;

public class Ospatar {

    public Boolean esteAranjata(Masa masa){
        return masa.getNrMasa()%4==0;
    }
}
