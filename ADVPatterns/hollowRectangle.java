package ADVPatterns;

public class hollowRectangle {
    public static void main(String[] args) {
        int len = 5;
        int bth = 4;
        for(int i=0; i<bth; i++){
            for(int j=0; j<len; j++){
                if(i == 0 || i == bth-1){
                    System.out.print("*");
                }
                else{
                    if(j == 0 || j == len-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
