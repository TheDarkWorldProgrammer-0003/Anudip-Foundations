import java.util.*;

public class Sumofelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Declare the array
        // int[] array = new int[size];
        // int sum =0;

        // // Input array elements
        // System.out.println("Enter the elements of the array:");

        // for (int i = 0; i < size; i++) {
        // array[i] = sc.nextInt();
        // // sum of elements
        // sum = sum + array[i];

        // }
        // System.out.println("Sum of all array elements is: " + sum);

        // Reverse array of string
        // System.out.println("Enter the elements of the array:");
        // String [] array = new String[size];

        // for (int i = 0; i < size; i++) {
        // array[i] = sc.next();
        // }
        // // Printing reverse array of string
        // System.out.println("Reverse of array of String ");

        // for(int i = size-1; i>=0;i--){
        // System.out.println(array[i]);
        // }

        // Largest element in the array

        // Declare the array
        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // int max = array[0];

        // // Compare the remaining elements
        // for (int i = 1; i < size; i++) {

        // if (array[i] > max) {
        // max = array[i];
        // }

        // }
        // System.out.println("Maximum element: " + max);
        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {

                // Swap when the current element is smaller than the next
                if (array[i] < array[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Printing of sorted array
        System.out.println("Array in descending order:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
