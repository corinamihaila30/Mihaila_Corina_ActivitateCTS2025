package bakery.singleton;

import java.util.HashMap;
import java.util.HashSet;

public class BakeryRegistry {
    private String name;
    private String location;
    private Integer numberSweetsTypes;
    private Integer orderMaxCapacity;

    private static BakeryRegistry bakeryRegistry;
    HashMap<String,Sweet> hashSweets=new HashMap<>();

    private BakeryRegistry(String name, String location, Integer numberSweetsTypes, Integer orderMaxCapacity) {
        this.name = name;
        this.location = location;
        this.numberSweetsTypes = numberSweetsTypes;
        this.orderMaxCapacity = orderMaxCapacity;
    }

    public static synchronized BakeryRegistry getBakeryRegistry(){
        if(bakeryRegistry==null){
            bakeryRegistry = new BakeryRegistry("CookieWorld","Bucharest",123,200);
        }
        return bakeryRegistry;
    }

    public void prepare(Sweet sweet){
        if(!hashSweets.containsKey(sweet.getCode())){
            hashSweets.put(sweet.getCode(),sweet);
        }
        System.out.println(hashSweets.toString());
        return;
    }
}
