package recursion;

public class findFirstUpperCase {
    public static void main(String[] args) {
        System.out.println(findFirst(" dskagkG vv"));
    }
    
    public static char findFirst(String str){
        if(str.isEmpty()){
            return ' ';
        }
        if(Character.isUpperCase(str.charAt(0))){
            return str.charAt(0);
        } else {
            return findFirst(str.substring(1, str.length()));
        }
    }
}
