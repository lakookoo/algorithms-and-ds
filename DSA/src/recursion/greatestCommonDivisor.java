package recursion;

public class greatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(findGCD(48, 18));
        System.out.println(findGCD2(48, 18));
    }
    public static int findGCD(int a, int b){
        while(b != 0){
            int reminder = a % b;
            a = b;
            b = reminder;
        }
        return a;
    }

    public static int findGCD2(int a, int b){
        if(b == 0) return a;
        int r = a % b;
        return findGCD2(b, r);
    }
}
