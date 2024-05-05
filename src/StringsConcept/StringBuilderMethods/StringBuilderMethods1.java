package StringsConcept.StringBuilderMethods;

public class StringBuilderMethods1 {
    public static void main(String[] args) {
        // Creating StringBuilder objects
        StringBuilder sb1 = new StringBuilder(); // Empty StringBuilder
        StringBuilder sb2 = new StringBuilder("Hello"); // StringBuilder with initial value

        // Appending
        sb1.append("Java");
        sb1.append(" ");
        System.out.println("after appending: " + sb1);
        sb1.append("Programmer");
        System.out.println("after appending: " + sb1);

        // Length
        int length = sb1.length();
        System.out.println("Length: " + length);

        // Character at index
        char ch = sb1.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // Substring
        String sub = sb1.substring(2);
        System.out.println("Substring: " + sub);
        String sub2 = sb1.substring(0 , 6);
        System.out.println("Substring: " + sub2);

        // Inserting
        sb1.insert(5, "is ");   // from 5th index
        System.out.println(sb1);

        // Deleting
        sb1.delete(5, 8);    // delete substring from idx 5 to 8-1
        System.out.println(sb1);

        // Deleting single character
        sb1.deleteCharAt(1);
        System.out.println(sb1);

        // Replacing
        sb1.replace(0, 2, "He");   // replace the chararcter of idx 0 to 2-1 with He
        System.out.println(sb1);

        // Reverse
        sb1.reverse();
        System.out.println(sb1);

        // Converting to String
        String str = sb1.toString();
        System.out.println(sb1 + " " + str);

        // Comparing
        boolean isEqual = "Hello".equals(sb2.toString());
        System.out.println(isEqual);

        // Index of
        int indexOf = sb1.indexOf("aeH");    // return -1 if substring is not present
        System.out.println(indexOf);

        // Last index of
        int lastIndexOf = sb1.lastIndexOf("a");
        System.out.println(lastIndexOf);

        // Conversion
        int num = 123;
        StringBuilder numAsString = new StringBuilder();
        numAsString.append(num);
        System.out.println(numAsString);

        // Appending boolean
        boolean bool = true;
        sb1.append(bool);
        System.out.println(sb1);


    }
}
