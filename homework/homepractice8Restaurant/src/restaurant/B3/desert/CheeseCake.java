package restaurant.B3.desert;

import restaurant.B3.FelDeMancare;

public class CheeseCake extends FelDeMancare {
    private Float cantitateCiocolata;
    @Override
    public void descriereFelMancare() {

        System.out.println("Canitatea de cioco pe Cheesecake este de" + cantitateCiocolata);
    }

    public CheeseCake(Float cantitateCiocolata) {
        this.cantitateCiocolata = cantitateCiocolata;
    }
}
