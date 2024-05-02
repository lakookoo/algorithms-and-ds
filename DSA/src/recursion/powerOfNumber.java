package recursion;

public class powerOfNumber {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
    // O(log2(n))
    public static int power(int base, int exp){
        if(base == 0) return 0;
        if (exp == 1) return base;
        return base * power(base, exp - 1);
    }

    public static int power2(int base, int exp){
        if(base == 0) return 0;
        if (exp == 1) return base;
        int res = 1;
        for (int i = 1; i <= exp; i++){
            res = res * base;
        }
        return res;
    }
}
