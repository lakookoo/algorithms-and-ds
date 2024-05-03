package glassDoor;

import java.util.HashSet;
import java.util.Set;

public class getCommonCharacters {
    public static void main(String[] args) {
        System.out.println(findCommonLetters("Hello bublick", "elo bumnuj"));
    }
    
    public static String findCommonLetters(String str1, String str2){
        Set<Character> setStr2 = new HashSet<>();
        Set<Character> commonLetters = new HashSet<>();
        for( char ch : str2.toCharArray()){
            setStr2.add(ch);
        }
        
        for (int i = 0; i < str1.length(); i++){
            if(setStr2.contains(str1.charAt(i))) {
                commonLetters.add(str1.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : commonLetters){
            sb.append(ch);
        }
        String result = sb.toString();
        return result;
        
    }
}
