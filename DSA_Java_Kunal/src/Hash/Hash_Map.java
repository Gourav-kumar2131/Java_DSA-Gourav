package Hash;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // .put(K, v), .get( K ), .containsKey(K), remove(K), size(), .keySet()-- iterate
        map.put("Gourav", 133);
        map.put("Kunal", 144);
        map.put("Shradha", 155);
        map.put("Gourav", 200); // if key already exist then, update the value of key associate with it
//
//        System.out.println( map.get("Gourav"));
//
//        System.out.println(map.containsKey("Kunal"));
//        System.out.println(map.containsValue(133));
//
//        System.out.println(map.remove("Gourav")); // if not exist return null
//
//        System.out.println(map.size());


//        1st way to iterate the Hashmap.

        for( Map.Entry<String , Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

//        2nd way to iterate the Hashmap.
        Set<String> mapkey = map.keySet();
        for(String key : mapkey){
            System.out.println(key+ " "+ map.get(key));
        }

        for(int freq : map.values()){
            System.out.println(freq);

        }




    }
}
