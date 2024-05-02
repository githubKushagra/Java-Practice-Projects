package WildCard;

import java.util.Arrays;
import java.util.List;

public class WildcardUnboundedUsages <T> {

    T val;
    public T getValue(T val) {
        this.val = val;
        return val;
    }

    public void displayList(List<?> list) {
        System.out.print("Printing the items of list: ");
        for(Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        WildcardUnboundedUsages<Integer> wd = new WildcardUnboundedUsages<>();
        Integer value = wd.getValue(19);
        System.out.println(value);

        List<String> list = Arrays.asList("Kushagra" , "Varshney");
        wd.displayList(list);
    }
}
