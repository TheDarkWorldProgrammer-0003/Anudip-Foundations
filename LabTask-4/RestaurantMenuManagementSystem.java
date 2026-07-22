import java.util.*;
public class RestaurantMenuManagementSystem{
    public static void main (String []args){
        Scanner sc =  new Scanner(System.in);

        // Orignal Menu
        String menu = " Pizza, Burger, Pasta, Sandwich";

        // Display Complete Menu
        System.out.println("1. Complete Menu");
        System.out.println(menu);

        // Menu in UPPER CASE
        System.out.println("2.  Menu in UPPER CASE");
        System.out.println(menu.toUpperCase());
         // Menu in LOWER CASE
        System.out.println("3.  Menu in LOWER CASE");
        System.out.println(menu.toLowerCase());

         // Add Fries to the end of the menu
          menu = menu.concat(" , Fries");
        System.out.println("4. Menu after adding Fries:");
        System.out.println(menu);

        // Position of Pasta 
        int position = menu.indexOf("Pasta");
        System.out.println("5. Position of Pasta: " + position);
        
        // Replace burger with wrap
        menu = menu.replace("Burger", "Wrap");
        System.out.println("6. Menu after replacing Burger with Wrap:");
        System.out.println(menu);

         //Extract the word Sandwich
        int start = menu.indexOf("Sandwich");
        int end = start + "Sandwich".length();
        String item = menu.substring(start, end);

        System.out.println("7. Extracted Word:");
        System.out.println(item);

         //Display first five characters of menu 
        System.out.println("8. First Five Characters:");
        System.out.println(menu.substring(0, 5));

        // Split the menu into individual food items
        System.out.println("9. Individual Food Items:");
        String[] foods = menu.split(", ");

        for (String food : foods) {
        System.out.println(food);
        }

        //Compare Pizza and pizza using "==", ".euals()" , ".equlas.IgnoreCase()"
        String s1 = "Pizza";
        String s2 = "pizza";

        System.out.println("10. Comparing \"Pizza\" and \"pizza\":");

        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals() : " + s1.equals(s2));
        System.out.println("Using equalsIgnoreCase() : " + s1.equalsIgnoreCase(s2));

        //Compare Pizza and Pasta using compareTo()
        String a = "Pizza";
        String b = "Pasta";

        int result = a.compareTo(b);
        System.out.println("11. compareTo() Result: " + result);

        if (result == 0)
            System.out.println("Both strings are equal.");
        else if (result > 0)
            System.out.println("\"Pizza\" comes after \"Pasta\" alphabetically.");
        else
            System.out.println("\"Pizza\" comes before \"Pasta\" alphabetically.");

        //Convert integer to String
        int price = 299;
        String priceString = String.valueOf(price);

        System.out.println("12. Today's Special Price: Rs. " + priceString);

        //Count total food items
        System.out.println("13. Total Food Items: " + foods.length);

        //Check if user-entered item is available
        System.out.print("14. Enter a food item to search: ");
        String search = sc.nextLine();

        if (menu.toLowerCase().contains(search.toLowerCase())) {
            System.out.println(search + " is available in the menu.");
        } else {
            System.out.println(search + " is NOT available in the menu.");
        }

        //Display updated menu
        System.out.println("15. Final Updated Menu:");
        System.out.println(menu);

        sc.close();
    }
}