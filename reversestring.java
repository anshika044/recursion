package recursion;
import java.util.*;

public class reversestring {
    static String reverse2(String s){
     if(s.length()==0){
        return "";
    }
    //recursive
    String smallans= reverse2(s.substring(1));
    //self
    return smallans + s.charAt(0);

    }
static String reverse(String s, int idx){
    //base
    if(idx==s.length()){
        return "";
    }
    //recursive
    String smallans= reverse(s, idx+1);
    //self
    return smallans + s.charAt(idx);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(reverse(s, 0));
        String rev =reverse(s, 0);
        if(rev.equals(s)){
            System.out.printf(" %s is palindrome " , s);
        }else{
            System.out.printf(" %s is not palindrome",s);
        }
        // System.out.println(reverse2(s));
    }
    
}
