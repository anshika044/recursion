package recursion;
import java.util.*;
public class sumseries {

    static int sumserie(int n){
        if(n==0){
            return 0;
        }
        //recursive
        if(n%2==0){
            return sumserie(n-1)-n;
        }else{
            return sumserie(n-1)+n;
        }
    }
    

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println(" enter n ");
        int n = sc.nextInt();
        System.out.println(sumserie(n));

}


}
