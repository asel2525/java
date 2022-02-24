//LinkedHashMap and TreeMap
import java.util.HashMap;
import java.util.Map;


public class Test3{
    public static void main(String[] args){
        Map<Integer, String> hashMap = new HashMap<>(); // not ordered elements
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();// how elements was added so they will be showed
        Map<Integer, String> treeMap = new TreeMap<>();// elements are sorted

        testMap(hashMap);
        // testMap(linkedHashMap);
        // testMap(treeMap);

    }
    public static void testMap(Map<Integer, String> map){
        map.put(12, "John"); //keys cannot be same, but values can
        map.put(2, "Bob");
        map.put(54, "Mike");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
