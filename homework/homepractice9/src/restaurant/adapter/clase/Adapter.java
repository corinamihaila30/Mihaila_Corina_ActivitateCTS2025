package restaurant.adapter.clase;

public class Adapter extends SoftBar implements SoftPrintare {
    @Override
    public void printeaza() {
        preparaBautura("portocale", "limoncelo");
    }
}
