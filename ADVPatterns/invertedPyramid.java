package ADVPatterns;

public class invertedPyramid {
    public static void main(String[] args) {
        int a = 6;
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                if(i+j <= a-2){
                    System.out.print(" ");
                }
                else{
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
