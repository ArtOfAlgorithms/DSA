public class concatenation {

    public static void printString(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]){
        String firstname = "Param";
        String lastname = "Chheda";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        System.out.println(fullname.charAt(1));
    }
}
