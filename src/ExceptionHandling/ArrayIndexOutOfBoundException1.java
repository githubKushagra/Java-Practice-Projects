package ExceptionHandling;

public class ArrayIndexOutOfBoundException1 {
    public static void main(String[] args) {
        int []arr = {1 , 2 , 3};

        try{
            int ele = arr[3];    // Accessing index 3 which is out of bounds
            System.out.println("Element at index 3 is: " + ele);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Accessing index 3 which is out of bounds. - Index is out of bounds");
        }



        try{
            arr[3] = 19;     // Modifying element at index 3 which is out of bounds
            System.out.println("Modified element at index 3 is: " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Modifying element at index 3 which is out of bounds. - Index is out of bounds");
        }



        try{
            for(int i=0;i<=arr.length;i++) {    // Looping from 0 to array.length (inclusive), causing out-of-bounds access
                System.out.println(arr[i]);
            }
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Looping from 0 to array.length (inclusive), causing out-of-bounds access. - Index is out of bounds.");
        }
    }
}
