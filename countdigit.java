package recursion;
import java.util.*;
public class countdigit {

    static int countOfDigit(int n){
        //base case
        if( n>=0 && n<=9){
            return 1;
        }
       
        return countOfDigit(n/10) + 1;

    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(" enter n ");
      int n = sc.nextInt();
      System.out.println(countOfDigit(n));

    }
    
}
