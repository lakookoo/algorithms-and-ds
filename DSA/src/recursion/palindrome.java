package recursion;

public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean result = isPalindrome(str);
        System.out.println("Is the string a palindrome? " + result);
        String str2 = "arozaupalanalapuazora";
        boolean result2 = isPalindrome2(str2);
        System.out.println("Is the string a palindrome? " + result2);
    }
    
    public static boolean isPalindrome(String str){
        if(str.length() == 1) return true;
        if(str.length() == 2) return str.charAt(0) == str.charAt(1);
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public static boolean isPalindrome2(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
