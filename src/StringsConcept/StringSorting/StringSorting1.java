package StringsConcept.StringSorting;

import java.util.Arrays;

public class StringSorting1 {
    public static void main(String[] args) {
        String str = "this is kushagra varshney";
        String[] strArray = str.split(" ");
        char[] chArray = str.toCharArray();

        System.out.println("before sorting");
        System.out.println(str);
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(chArray));

        System.out.println("converting str array and ch array into normal string but before sorting");
        String arrayToString = String.join(" " , strArray);
        System.out.println(arrayToString);   // strArray to string

        String charArrayToString = new String(chArray);
        System.out.println(charArrayToString.trim());

        System.out.println("After sorting");
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
        Arrays.sort(chArray);
        System.out.println(Arrays.toString(chArray));


        System.out.println("converting str array and ch array into normal string but after sorting");
        String arrayToString2 = String.join(" " , strArray);
        System.out.println(arrayToString2);   // strArray to string

        String charArrayToString2 = new String(chArray);
        System.out.println(charArrayToString2.trim());

    }
}
