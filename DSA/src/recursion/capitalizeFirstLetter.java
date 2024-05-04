package recursion;

public class capitalizeFirstLetter {
    public static void main(String[] args) {
        System.out.println(capitalizeFirst("I love myself so much"));
    }
    
    public static String capitalizeFirst(String str){
        if(str.isEmpty()) return str;

        char chr = str.charAt(str.length()-1);
        if(str.length() == 1){
            return Character.toString(Character.toUpperCase(chr));
        }
        if((str.substring(str.length()-2, str.length()-1)).equals(" ")){
            chr = Character.toUpperCase(chr);
        }
        return capitalizeFirst(str.substring(0, str.length()-1)) + Character.toString(chr);
    }
}
