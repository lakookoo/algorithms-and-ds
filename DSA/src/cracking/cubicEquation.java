package cracking;
// Print all positive solutions for equation a^3 + b^3 = c^3 + d^3, where a, b, c, d are integers between 1 and 1000

public class cubicEquation {
    public static void main(String[] args) {

        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                for (int c = 1; c <= 1000; c++) {
                    for (int d = 1; d <= 1000; d++) {
                        if (Math.pow(a, 3) + Math.pow(b, 3) == Math.pow(c, 3) + Math.pow(d, 3)) {
                            System.out.println("Solution found: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
                            break;
                        }
                    }
                }
            }
        }

    }
}
