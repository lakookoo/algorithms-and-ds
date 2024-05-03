package glassDoor;

public class multiplyNumbers {
    public static void main(String[] args) {
        System.out.println(multiplyNumbers("12345"));
        System.out.println(multiplyNumbers( "1 2 3 4 5"));
        System.out.println(multiplyNumbers("1, 2, 3, 4, 5"));
        System.out.println(multiplyNumbers(""));
        System.out.println(multiplyNumbers( "0"));
        System.out.println(multiplyNumbers("000 0 0 0, 0"));
    }
    
    public static int multiplyNumbers(String str){
        if(str.isEmpty()) return 0;
        int product = 1;
        for ( int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                int digitValue = ch - '0';
                product *= digitValue;
            }
            
            
        }
        return product;
    }
}
