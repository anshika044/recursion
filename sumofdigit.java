package recursion;
import java.util.*;
public class sumofdigit {

    static int sod( int n ){

        //base case
        if( n>=0 && n<=9){
            return n;
        }

        return sod(n/10)+ n%10;

        //subproblem
    //    int ans = sod(n/10);

       //self
    //    return sod(ans) + n%10;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter n ");
        int n = sc.nextInt();
        System.out.println(sod(n));

    }
    
}
