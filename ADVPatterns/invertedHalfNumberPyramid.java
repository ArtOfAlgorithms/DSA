package ADVPatterns;

public class invertedHalfNumberPyramid {
    public static void main(String[] args) {
        int a = 6;
        for(int i=a; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}