package ADVPatterns;

public class solidRhombus {
    public static void main(String[] args) {
        int a = 6;
        for(int i=a-1; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<a; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
