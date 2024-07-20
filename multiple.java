package recursion;
import java.util.*;
public class multiple {

    static void mul(int n , int k){
        //base
        if(k==0){
            return;
        }

        //recursive
        mul(n, k-1);

        //self
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter n ");
        int n = sc.nextInt();
        System.out.println(" enter k ");
        int k = sc.nextInt(); 
        mul(n, k);
    }
    
}
