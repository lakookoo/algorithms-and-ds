package recursion;

public class reverseString {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = reverse(str);
        System.out.println("Reversed string: " + reversed);
        String reversed2 = reverse2(str);
        System.out.println("Reversed string: " + reversed2);
    }
    
    public static String reverse(String str){
        if(str.length() <= 1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static String reverse2(String str){
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
