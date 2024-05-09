package cracking;

import java.util.HashMap;
import java.util.Map;

public class cubePairs {

    static class Pair {
        int a, b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        int n = 1000;
    }

    public static void findCubePairs(int n){
        Map<Integer, Pair>  map = HashMap<>();
        for(int  i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int sum = i * i * i + j * j * j;
                map.put(sum, new Pair(i, j));
            }
        }

        for(int  i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int sum = i * i * i + j * j * j;
                if(map.containsKey(sum)){
                    Pair pair = map.get(sum);
                    System.out.println("Pair 1: (" + i + ", " + j + ")");
                    System.out.println("Pair 2: (" + pair.a + ", " + pair.b + ")");
                } 
            }
        }
    }
}
