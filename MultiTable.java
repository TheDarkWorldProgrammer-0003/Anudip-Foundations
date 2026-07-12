import java.util.*;

public class MultiTable {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number to calculate the Multiplication Table");
            int num = sc.nextInt();
            int res;

            for(int i =1 ; i<=10;i++){
                res = num*i;
                System.out.println(res);

            }
        }
    }
    
}
