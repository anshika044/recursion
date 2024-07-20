package recursion;
import java.util.*;
public class maxvalue {
    
    static int maxivalue(int [] arr, int idx){
    //self
    if(idx==arr.length-1)
    return arr[idx];
    //recursive
    int smallAns= maxivalue(arr, idx+1);
    //self
    return Math.max(smallAns,arr[idx]);
    }

    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println(" enter n ");
     int n = sc.nextInt();

     int [] arr = new int[n];

     //input
     for(int i =0; i<n;i++){
        arr[i]=sc.nextInt();
     }
System.out.println(maxivalue(arr, 0));

    }
}
  


