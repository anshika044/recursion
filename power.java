package recursion;
import java.util.*;
public class power {

static int pow(int p , int q){

    //base case
    if(q==0){
        return 1;
    }
    int smallpow = pow(p, q/2);

    if(q%2==0){
        return smallpow * smallpow;
    }
    else{
        return p * smallpow *smallpow;
    }
    //subprob
    // int smallans= pow(p, q-1);
    //self
    // return pow(p, q-1) * p;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter p ");
        int p = sc.nextInt();
        System.out.println(" enter q ");
        int q = sc.nextInt();
        System.out.println(pow(p, q));
    }
    
}
