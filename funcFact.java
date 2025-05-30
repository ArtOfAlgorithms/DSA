import java.util.*;
public class funcFact{

    public static int Factorial(int n){
        int Fact=1;
        for(int i=n; i>0; i--){
            Fact = Fact*i;
        }
        return Fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int Fact = Factorial(n);
        System.out.println(Fact);
    }
}