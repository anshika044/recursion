package recursion;
import java.util.*;

public class frogproblem {

    static int best(int[] h,int n, int idx){
        //base
        if(idx==n-1){
            return 0;
        }
        int opt1= best(h, n, idx+1) + Math.abs(h[idx]-h[idx+1]);
        if(idx==n-2){
            return opt1;
        }
        int opt2= best(h, n, idx+2)+Math.abs(h[idx]-h[idx+2]);
        return Math.min(opt1, opt2);
    }
    public static void main(String[] args) {
        int[] h ={10,30,40};
        System.out.println(best(h, h.length, 0));
    }
    
}
