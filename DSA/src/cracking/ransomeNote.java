package cracking;

import java.util.HashMap;
import java.util.Map;


public class ransomeNote {
    public static void main(String[] args) {
        String ransomNote = "aabb";
        String magazine = "aabbc";

        System.out.println(isRansomeNoteHere( magazine, ransomNote)); // Output: true
    }
    
    public static boolean isRansomeNoteHere(String magazine, String note){
        Map<Character, Integer> mapMag = new HashMap<>();
       
        
        for (char ch : magazine.toCharArray()){
            mapMag.put(ch, mapMag.getOrDefault(ch, 0) + 1);
        }

        for (char ch : note.toCharArray()){
            if(!mapMag.containsKey(ch) || mapMag.get(ch) <= 0){
                return false;
            }
            mapMag.put(ch, mapMag.get(ch) - 1);
        }

        return true;
        
    }
}
