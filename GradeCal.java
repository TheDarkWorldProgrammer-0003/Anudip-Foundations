import java.util.*;
public class GradeCal {
    
    public static void  main(String[] args){
       
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the grades of student");
            double grade = sc.nextDouble();

            if(grade >= 90 ){
                System.out.println("Score : Grade A");

            }
            else if(grade >=75 && grade <=89){
                System.out.println("Score : Grade B");
            }
            else if(grade >=60 && grade <=74){
                System.out.println("Score : Grade C");
            }
            else{
                System.out.println("Score : Grade D");
            }
        }
       
    }
    
}
