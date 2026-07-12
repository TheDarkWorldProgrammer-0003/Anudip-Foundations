import java.util.*;
public class SumOfNo {
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the  postive number till which sum is calculated");
            int num = sc .nextInt();
            int sum=0;
            int i=1;
            if(num <=0){
                System.out.println("Invalid Input");
            }
            else{
                while (i <= num) {
                sum += i;
                i++;
            }
            }
   System.out.println("Sum of all the numbers till 'num' is " + sum);
        }
    
    }
    
}
