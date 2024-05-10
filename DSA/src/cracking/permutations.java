package cracking;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

// Given a smaller string s and a bigger string b design an algorithm to find
// all permutations of the shorter string within the longer one.
// Print a location of each permutation 
public class permutations {
    public static void main(String[] args) {
        List<Integer> result = getPermutations("absdd", "absmdjkfjdabsddlklbadssdcabs");
        if (!result.isEmpty()) {
            System.out.println("Permutations found at indices: " + result);
        } else {
            System.out.println("No permutations found.");
        }
    }
    

    public static List<Integer> getPermutations(String s, String b){
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        int sLen = s.length();
        int bLen = b.length();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            sMap.compute(ch, (k, v) -> v == null ? 1 : v + 1);    
        }

        //sMap.forEach((key, value) -> System.out.println(key + " : " + value));

        while(right < b.length()){
            char rightCh = b.charAt(right);
            windowMap.put(rightCh, windowMap.getOrDefault(rightCh, 0) + 1);
            
            if(right - left + 1 == sLen ){
                if(isPermutation(sMap, windowMap)){
                    result.add(left);
                }
                char leftCh = b.charAt(left);
                if (windowMap.containsKey(leftCh)){
                    windowMap.put(leftCh, windowMap.get(leftCh) - 1);
                    if (windowMap.get(leftCh) == 0){
                        windowMap.remove(leftCh);
                    }
                }
                left++;
            }
            right++;
            
        }
        return result;
        
    }
    

    

    private static boolean isPermutation(HashMap<Character, Integer> mapS, HashMap<Character, Integer> mapW){
        if(mapS.size() != mapW.size()) return false;
        for(HashMap.Entry<Character, Integer> entry : mapS.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();

            if(!mapW.containsKey(key) || mapW.get(key) != value) return false;
        }
        return true;
    }
}
