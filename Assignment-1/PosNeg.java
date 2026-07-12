import java.util.*;
public class PosNeg {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check if it is positive or negative:");
            double num = sc.nextDouble();
            if(num > 0){
                System.out.println("Positive");
            } else if(num < 0){
                System.out.println("Negative");
            } else {
                System.out.println("The number is zero");
            }
        }
    }
    
}
