import java.util.*;
public class Factorial{
    static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)) {
            System .out.println("Enter the number to calculate the Fcatorial of number");
            int num = sc.nextInt();
            System.out.println("Factorial of " + num + " is "
                               + factorial(5));
        }
        hello buddy
        
       
    }
}