package StringsConcept.StringMethods;

import java.util.Arrays;

public class StringMethods1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Java");
        String s = "Programmer";


        // Concatenation
        String s3 = s1 + " " + s2 + " " + s;
        System.out.println("Concatenation of two strings: " + s3);
        // OR using .concat() mth
        String s4 = s1.concat(s2);    // it will not add space btn two strings
        System.out.println("Concatenation of two strings: " + s4);


        // length
        System.out.println("Length of s3 string is: " + s3.length());


        // character at any index
        char ch = s3.charAt(0);
        System.out.println("Character at index 0: " + ch);



        // In Java, the charAt() method of the String class returns a char type, not a String type. Therefore, you cannot directly
        // use the equals() method, which is meant for comparing strings, on the result of charAt().

        // To compare a character to a string, you need to convert the character to a string. You can do this by using Character
        // .toString() or by directly comparing the character to a single-character string using single quotes.
        // comparing character from character/string
        boolean check = Character.toString(s3.charAt(0)).equals("k");
        System.out.println("Checking for specific character: " + check);
        // OR
        boolean check2 = s3.charAt(0) == 'H';
        System.out.println("Checking for specific character: " + check2);


        // comparing string from string
        boolean c3 = s1.equals(s2);
        System.out.println("Is s1 equals to s2: " + c3);
        // when case is ignored
        boolean c4 = s1.equalsIgnoreCase("hellO");
        System.out.println("Is s1 equals to s2: " + c4);



        // accessing s3 string by character-by-character
        System.out.print("s3 by character-by-character: ");
        for(int i=0;i<s3.length();i++) {
            System.out.print(s3.charAt(i));
        }
        System.out.println();



        // accessing substring from the string
        String subs3 = s3.substring(0,7);    // substring from index 0 to 6 (starting index to ending index - 1)
        System.out.println("Substring in s3 from 0 to 6: " + subs3);



        // checking for presence
        boolean contains = s3.contains("Java");    // we can check for any substring also
        System.out.println("Is s3 contains Java: " + contains);
        boolean c5 = s3.startsWith("Hel"); // we can check for any substring
        System.out.println("Is s3 starts with Hel: " + c5);
        boolean c6 = s3.endsWith("mmer"); // we can check for any substring
        System.out.println("Is s3 ends with mmer: " + c6);


        // changing case
        String uppercase = s4.toUpperCase();
        System.out.println("s4 in uppercase: " + uppercase);
        String lowercase = s4.toLowerCase();
        System.out.println("s4 in lowercase: " + lowercase);


        // finding index
        int idx1 = s3.indexOf("llo");
        System.out.println("Index of llo: " + idx1);
        int idx2 = s3.lastIndexOf('o');
        System.out.println("Last index of o: " + idx2);



        // replacing character
        String r1 = s3.replace('a' , 'K');
        System.out.println("After replacing a with K: " + r1);
        String r2 = s3.replaceAll("[aeiouAEIOU]" , "");
        System.out.println("After replacing all the vowels: " + r2);




        // trim to remove extra spaces
        String s5 = "   Kushagra Varshney   ";
        System.out.println("s5 before trim(): " + s5);
        System.out.println("s5 after trim(): " + s5.trim());



        // splitting
        String[] strArray1 = s3.split(" ");
        System.out.println(Arrays.toString(strArray1));
        for(String i : strArray1) {
            System.out.print(i + " ");
        }
        System.out.println();



        // joining
        String[] strArray2 = strArray1;
        String joining = String.join(" " , strArray2);
        System.out.println("After joining the wrods from an array: " + joining);




        // Conversion from int to string
        int num = 123;
        String numAsString = String.valueOf(num);
        System.out.println("Num in string form: " + numAsString);

        // Conversion from string to int
        String num2 = "123";
        int numAsInteger = Integer.parseInt(num2);
        System.out.println("Num in int form: " + numAsInteger);


        // string to char array
        char[] chArray1 = s3.toCharArray();
        System.out.println(chArray1);




        // Check empty
        boolean isEmpty = s3.isEmpty();
        System.out.println(isEmpty);

    }
}
