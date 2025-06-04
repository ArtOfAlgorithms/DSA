import java.util.*;

public class strings{
    public static void main(String args[]){
        String str = "Param";
        String str2 = new String("Param");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;

        System.out.print("Enter name: ");
        // name = sc.next();
        name = sc.nextLine(); // inputs full line
        System.out.println("Name: " + name);
        System.out.println("Length: " + str.length());
    }
}
