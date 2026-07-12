import java.util.*;
public class EvenOdd {
   public static void main (String[]args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number to check if it is even or odd:");
        double num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
   }
}
