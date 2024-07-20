package recursion;
import java.util.*;

public class ispower4 {

    static boolean power4(int n){
     //self
     if(n==0)return false;
     while(n!=1){
        if(n%4!=0){
            n=n/4;
        }
     }
     return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(power4(n));

    }
    
}
