package recursion;
import java.util.*;
public class palindrome {
    static boolean ispalindrome(String s, int l,int r){
    //base
    if(l>=r){
        return true;
    }
    //self && recurse
    return (s.charAt(l)==s.charAt(r) && ispalindrome(s, l+1, r-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(ispalindrome(s, 0, s.length()-1));
    }
    
}
