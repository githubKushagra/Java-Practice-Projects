package ExceptionHandling;

public class NullPointerException1 {
    public static void main(String[] args) {
        System.out.println("Here we will talk about Null Pointer Exception");

//      if str and strArray is having "null" string value instead of null value then exception will not occur
        String str = null;
        String[] strArray = null;

        try{
            int length = str.length();   // Accessing length() method of a null object
            System.out.println("Length of str String variable is: " + length);
        } catch(NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot get length of a null string.");
        }



        try{
//          Dereferencing means - In Java, arrays are objects, and when you have an array reference, dereferencing it means accessing
//          elements or properties of that array. For example, if you have an array reference array, dereferencing it would involve
//          accessing its elements like array[0], array.length, etc.
            int length = strArray.length;   // Dereferencing a null array
            System.out.println("Length of str String variable is: " + length);
        } catch(NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot get length of a null array.");
        }




        try{
            boolean status = str.isEmpty();  // Calling isEmpty() method of a null object
            System.out.println("Length of str String variable is: " + status);
        } catch(NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot check if a null string is empty.");
        }
    }
}
