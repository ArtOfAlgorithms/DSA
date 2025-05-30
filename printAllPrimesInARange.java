public class printAllPrimesInARange{
    public static boolean isPrime(int i){
        for(int j=2; j<(i); j++){
            if(i%j == 0){
                break;
            }
            else{
                if(j==i-1){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 100;
        System.out.print("2 ");
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}