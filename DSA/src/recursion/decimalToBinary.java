package recursion;

public class decimalToBinary {
    public static void main(String[] args) {
        System.out.println(convertToBinary(10));
        System.out.println(convertToBinary2(10));
    }
    public static int convertToBinary(int number){
        if( number  == 0) return 0;
        return number % 2 + 10 * convertToBinary(number/2);
    }

    public static int convertToBinary2(int number){
        if (number == 0) return 0;
        int binary = 0;
        int base = 1;

        while (number > 0){
            int r = number % 2;
            binary += r * base;
            base *= 10;
            number /= 2;

        }
        return binary;
    }
}
