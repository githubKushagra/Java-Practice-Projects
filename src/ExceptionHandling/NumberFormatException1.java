package ExceptionHandling;

public class NumberFormatException1 {
    public static void main(String[] args) {
        System.out.println("Here we will talk about Number Format Exception");

        String str = "abc";     // if it has "123" then it would have run successfully
        String num = "85348552081920";    // Out of range for int data type, if it had 9 digit no then it would have run successfully
        String mixtureOfNumberAndString = "19Kush20Kush";    // Invalid characters mixed with valid numbers

        try {
            int number = Integer.parseInt(str);    // Attempting to parse the string
            System.out.println("Parsed Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Unable to parse string (abc) as a number.");
        }



        try {
            int number = Integer.parseInt(num);    // Attempting to parse the string
            System.out.println("Parsed Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Number is too large for the int data type.");
        }



        try {
            int number = Integer.parseInt(mixtureOfNumberAndString);    // Attempting to parse the string
            System.out.println("Parsed Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid characters in the string.");
        }
    }
}
