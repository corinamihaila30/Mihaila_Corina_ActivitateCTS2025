package recap.patterns.singletoneRegistry;

import java.util.HashMap;

public class Registry {
    public static final HashMap<String,PachetTuristic> hashMap = new HashMap<>();
    public static void register(String key, PachetTuristic val){
        if(hashMap.containsKey(key)){
            System.out.println("Cheia"+key+"este deja in registru");
        }
        else hashMap.put(key,val);
    }

    public static PachetTuristic getPachet(String key){
        return hashMap.get(key);
    }

}
