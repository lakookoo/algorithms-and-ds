package recursion;

// find the sum of digits of positive integer number using recursion

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDig(1345));
    }
    // O(log10(n)) - logarithm with the base 10
    public static int sumOfDig(int n){
        if(n == 0) return 0;
        return  n%10+sumOfDig(n/10);
    }
    // O(log10(n))
    public static int sumOfDig2(int n){
        int sum = 0;
        while( n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
