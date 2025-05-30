import java.util.*;

public class Functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.:");
        int n = sc.nextInt();
        // int dec = binToDec(n);
        // int bin = decToBin(n);

        System.out.println(palindrome(n));
    }
    public static int binToDec(int b){
        int pow = 0;
        int decimal = 0;
        while(b>0){
            decimal = decimal + b%10*((int)Math.pow(2, pow));
            pow++;
            b/=10;
        }
        return decimal;
    }

    public static int decToBin(int dec) {
        int bin = 0;
        int pos = 1;
        while(dec>0){
            bin = bin + dec%2*pos;
            dec = dec/2;
            pos = pos*10;
        }
        return bin;
    }
// Write a Java program to check if a number is a palindrome in Java
    public static boolean palindrome(int num){
        int n = num;
        int rev = 0;
        int remainder = 0;
        while(n != 0){
            remainder = n%10;
            rev = rev*10 + remainder;
            n = n/10;
        }
        if(rev == num){
            return true;
        }
        return false;
    }
}
