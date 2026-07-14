import java.util.*;

public class Arrays {
    
    public static void main(String[] args) {
        // int marks [] = {10, 20, 30};
        // // System.out.println(marks); //[I@4517d9a3 it will print the address of
        // array not the array element

        // for (int i=1;i<=marks.length;i++)
        // System.out.println(marks[i]); //20
        // //30 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 3 out of bounds forlength 3

        // Create an array by taking input from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        // Prompt user for array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Declare and initialize the array
        int[] array = new int[size];

        // Take input for each element
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Print the array
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        sc.close();

    }

}
