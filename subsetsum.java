package recursion;
import java.util.*;

public class subsetsum {

    static void sumsubset(int [] a, int n , int idx,int sum){
        //base
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        sumsubset(a, n, idx+1, sum+ a[idx]);
        sumsubset(a, n, idx+1, sum);
    }
    public static void main(String[] args) {
        int[] a= {2,4,5};
        sumsubset(a, a.length, 0, 0);

    }
    
}
