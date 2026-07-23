import java.util.*;

public class Stringss {

    public static void main(String[] args) {
        // String s = "Shrey";
        // String a = " ";
        // for (int i = s.length()-1; i >= 0; i--) {

        // a = a + s.charAt(i);

        // }
        // System.out.println(" Reversed string is:" + a);

        // Solve using Split method

        // Sample input = "Hello World"
        // Sample output = "World Hello"

        // String inp = "Hello World";
        // String[] str = inp.split(" ");
        // for (int i = str.length - 1; i >= 0; i--) {
        // System.out.print(str[i] + " ");
        // }

        // Pointer : A pointer is a variable that stores the memory address of another
        // variable.
        // In java,there are no explicit pointers like in C or C++.

        // Why we use two pinter approach instead of split method?

        // Solve using Two Pointer method
        // Sample input = "Hello World"
        // Sample output = "World Hello"

        // String inp = "Hello World";
        // int end = inp.length();

        // for (int i = inp.length() - 1; i >= 0; i--) {
        // if (inp.charAt(i) == ' ') {
        // System.out.print(inp.substring(i + 1, end) + " ");
        // end = i;
        // }
        // }
        // System.out.print(inp.substring(0, end)); // to print Hello

        // Sample input = "Hello World"
        // Sample output = "dlroW olleH"

        // Method -1

        // String inp = "Hello World";

        // for (int i = inp.length() - 1; i >= 0; i--) {
        // System.out.print(inp.charAt(i));
        // }

        // Method -2

        // String inp = "Hello World";
        // String rev = "";

        // for (int i = inp.length() - 1; i >= 0; i--) {
        // rev += inp.substring(i, i + 1);
        // }

        // System.out.println(rev);

        // To count the frequency of character in a string

        String str = "Hello World";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            // Skip if already counted
            boolean visited = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    visited = true;
                    break;
                }
            }

            if (visited)
                continue;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " : " + count);
        }
    }
}
