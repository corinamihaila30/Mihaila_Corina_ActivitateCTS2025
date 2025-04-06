package recap.singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SingletonMain {
    public static void main(String[] args) {
        ParlamentRo parlamentRo= ParlamentRo.getInstance("Constitutiei",100,true);
        System.out.println(parlamentRo.toString());

        ParlamentRoEagger parlamentRoEagger = ParlamentRoEagger.getInstance();
        ParlamentRoEagger parlamentRoEagger2 = ParlamentRoEagger.getInstance();
        parlamentRoEagger2.setAdresa("Unirii");
        System.out.println(parlamentRoEagger.toString());
        System.out.println(parlamentRoEagger2.toString());
        ParlamentRo parlamentRo1 = ParlamentRo.getInstance("Constitutiei",100,false);
        parlamentRo1.setAdresa("Abc");
        System.out.println(parlamentRo1);
        System.out.println(parlamentRo);
    }
}