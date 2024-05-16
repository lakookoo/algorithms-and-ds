package cracking;

public class recursiveStringPermutations {

    public static void main(String[] args) {
        String str = "abc def";
        System.out.println("All permutations of \"" + str + "\":");
        printAllPermutations(str);
    }
    
    public static void printAllPermutations(String str){
        printAllPermutationsHelper("", str);
    }

    public static void printAllPermutationsHelper(String curentPermutation, String remaining){
        if (remaining.length() == 0) System.out.println(curentPermutation);
        else {
            for (int i = 0; i < remaining.length(); i++) {
                String newCurPermutation = curentPermutation + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                printAllPermutationsHelper(newCurPermutation, newRemaining);
            }
        }
    }
}
