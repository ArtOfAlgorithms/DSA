package ADVPatterns;

public class butterflyPattern {
    public static void main(String[] args) {
        int a = 4;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=2*a; j++){
                if(j<=i){
                    System.out.print("*");
                }
                else if(j>i && j<=2*a-i){
                    System.out.print(" ");
                }
                else if(j>=2*a-i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=a; i>=0; i--){
            for(int j=1; j<=2*a; j++){
                if(j<=i){
                    System.out.print("*");
                }
                else if(j>i && j<=2*a-i){
                    System.out.print(" ");
                }
                else if(j>=2*a-i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
