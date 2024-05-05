package Map.Interface;


import java.util.Map;
import java.util.TreeMap;

public class Map4 {
    public static void main(String[] args) {
        int []arr = {1,5,1,5,4,1,4,6,5,1,1,5,4,1,1,1,8,4,1,6,8,4,6,1,5,8,4,6,1,5,4,5,1};
        Map<Integer , Integer> map = new TreeMap<>();

        for(Integer i : arr) {
            if(!map.containsKey(i)) {
                map.put(i,0);
            }
            map.put(i,map.get(i)+1);
        }

        System.out.println(map);
        System.out.println(map.entrySet());


        String[] words = {"apple", "banana", "orange", "apple", "banana", "grape", "apple"};
        Map<String , Integer> strMap = new TreeMap<>();

        for(String str : words) {
            if(!strMap.containsKey(str)){
                strMap.put(str , 0);
            }

            strMap.put(str , strMap.get(str)+1);
        }
        System.out.println(strMap);
        System.out.println(strMap.entrySet());
    }
}
