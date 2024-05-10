package cracking;

import java.util.HashMap;

// Given a smaller string s and a bigger string b design an algorithm to find
// all permutations of the shorter string within the longer one.
// Print a location of each permutation 
public class permutations {
    public static void main(String[] args) {
        getPermutations("absd", "absmdjkfjdl;kl;d");
    }
    

    public static void getPermutations(String s, String b){
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        int left = 0;
        int right = b.length() - 1;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            sMap.compute(ch, (k, v) -> v == null ? 1 : v + 1);
            // if(sMap.containsKey(ch)){
            //     sMap
            // }

           
        }
        sMap.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
