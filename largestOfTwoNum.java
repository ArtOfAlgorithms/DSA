import java.util.*;

public class largestOfTwoNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
}