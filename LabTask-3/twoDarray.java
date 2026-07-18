
import java.util.*;

public class twoDarray {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

     // Print the primary diaonal of the array : {10,20,30}

        int b[][] = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 } };

        // for(int i = 0;i<b.length;i++){
        // for(int j=0;j<b.length;j++){

        // if(i==j){
        // System.out.print(b[i][j] + " ");
        // }
        // }
        // }

        // Print the secondry diaonal of the array : {30,50,70}

        // for(int i = 0;i<b.length;i++){
        // for(int j=0;j<b.length;j++){

        // if (i + j == b.length - 1){
        // System.out.print(b[i][j] + " ");
        // }
        // }
        // }
        // System.out.println();
        // int even=0, odd =0;

        // // Even and Odd no. in 2D Array
        // for(int i = 0;i<b.length;i++){
        // for(int j=0;j<b.length;j++){

        // if(b[i][j] % 2 == 0){
        // even ++;

        // }
        // else{
        // odd++;

        // }

        // }
        // }
        // System.out.println( "Number of even no.in given matrix =" + even + " Number
        // of even no.in given matrix =" + odd);

        // To find the sum of every row and column

        int m = b.length, n = b[0].length;
        int sume = 0, sumo = 0;

        // row sum

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                sume += b[i][j];

            }
            System.out.println("Sum of row " + i + " = " + sume);
        }

        //  column sums
        for (int j = 0; j < n; j++) {

            for (int i = 0; i < m; i++) {
                sumo += b[i][j];
            }
            System.out.println("Sum of col " + j + " = " + sumo);

        }
        sc.close();

    }
}


