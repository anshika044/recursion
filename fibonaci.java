package recursion;
import java.util.*;
public class fibonaci {

    static int fib(int n){
        if(n == 0 || n==1){
            return n;
        }
        // subproblem
        // int prev=fib(n-1);
        // int prevprev = fib(n-2);

        // self
        // return prev + prevprev;
        return fib(n-1)+fib(n-2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter n ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
        System.out.println(fib(i));
        }
    }
    
}
