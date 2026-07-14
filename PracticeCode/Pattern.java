import java .util.*;
public class Pattern {
    public static void main(String[]args){
//     for (int row =1;row<=5;row++){
//         for( int col = 1;col<=row;col++){
//             System.out.print("@");
//         }
//         System.out.println();

//     }

// for (int row =5; row>=1; row--){
//         for( int col = 1; col <= row; col++){
//             System.out.print("@"); 
//         }
//         System.out.println();
    //@ @ @ @ @
    //@ @ @ @
    //@ @ @
    //@ @
    //@ 


    // for (int row =5; row>=1; row--){
    //     for( int col = 1; col <= row; col++){
    //         System.out.print(row); 
    //     }
    //     System.out.println();

//55555
// 4444
// 333
// 22
// 1

// for (int i=1; i<=3; i++){
//         for( int j = 1; j <=2; j++){
//             System.out.print(i +"" + j+" "); 
//         }

// }

// for (int i=1; i<=5; i++){
//     if(i ==3)
//         continue;
//     System.out.print(i + " ");
// }

// Count how many numbers are there between 1 and 100 which are divisible by 7 

// int count =0;
// for (int i =1;i<=100;i++){
//     if( i % 7 == 0)
//         count ++;

// }
// System.out.print("No. of digits divisible by 7 : " + count);


// To check whether the number is strong no. or not
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the positive number to check whether the no. is strong no. or not ");
// int n = sc.nextInt();
// int num = n;
// int sum = 0;
// while (num != 0) {
//     int rem = num % 10;
//     int f = 1;
//     for (int i = 1; i <= rem; i++) {
//         f *= i;
//     }
//     sum += f;
//     num /= 10;
// }
// if (sum == n) {
//     System.out.print("Strong No.");
// } else {
//     System.out.print("Not a Strong No.");
// }
// sc.close();


// Plaindrome of number 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the positive number to check whether the no. is palindrome or not  ");
int n = sc.nextInt();
int num = n;
int rem, sum =0;



while (n!=0){
    rem = n%10;
    sum = sum*10 +rem;
    n = n/10;


}
if(sum == num){
    System.out.println("Palindrome Number");
}
else {
    System.out.println("Not a Palindrome Number");
}
sc.close();
}
}





