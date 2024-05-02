package recursion;

// find the sum of digits of positive integer number using recursion

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDig(1345));
    }
    
    public static int sumOfDig(int n){
        if(n == 0) return 0;
        return  n%10+sumOfDig(n/10);
    }
}
