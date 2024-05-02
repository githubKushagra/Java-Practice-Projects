// Map is an interface and to implement that we have 3 classes -
// 1. HaspMap class
// 2. LinkedHaspMap
// 3. TreeMap
// 4. HashTable


package Map.Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Map1 {
    public static void main(String[] args) {
        Map<String,String> mapItems = new HashMap<>();

        mapItems.put("name" , "Kushagra");
        mapItems.put("actor" , "Akshay");
        mapItems.put("company" , "MicroSoft");
//      Key should be unique and can be used only one time but if we use it again then at this key , the value will be updated
//      with the new value as I have use company key twice so noe the value at key-company is Tata not MicroSoft bcz Tata has
//      used after MicroSoft
        mapItems.put("company" , "Tata");
        mapItems.putIfAbsent("country" , "India");

        System.out.println("Items in the map: " + mapItems);

//      KeySet() will fetch the keys from the map
        Set<String> keys = mapItems.keySet();

        for(String key : keys) {
            System.out.println("Key: " + key + " and Value: " + mapItems.get(key));
        }

//      deleting the key-value pair
        mapItems.remove("company");
        System.out.println("Updated map after deleting company key from it: ");

        for(String key : keys) {
            System.out.println("Key: " + key + " and Value: " + mapItems.get(key));
        }

//      checking for specific key and value
        System.out.println("Does it contain country as a key: " + mapItems.containsKey("country"));
        System.out.println("Does it contain Akshay as a value: " + mapItems.containsValue("Akshay"));

//      getting the value by specified key
        System.out.println("Value at actor key is: " + mapItems.get("actor"));

//      retrieving the size of the map (it will return no. of key-values pair present in the map)
        System.out.println("Size of the map: " + mapItems.size());



//      Another way to fetch the key-value pair using Map.Entry<> interface which is available insede the Map interface (also called as nested Interface)
        System.out.println("Fetching the key-value pair using Map.Entry<> Interface: ");
        Set<Map.Entry<String , String>> values = mapItems.entrySet();
        for(Map.Entry<String , String> i : values) {
            System.out.println("Key: " + i.getKey() + " and Value: " + i.getValue());
//            System.out.println(i.getKey() + " : " + i.getValue());
        }

    }
}
