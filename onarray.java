package recursion;
import java.util.*;

public class onarray {

    static void printarr(int [] arr, int idx ){
      
        //base
        if(idx==arr.length){
            return;
        }

        //self work
        System.out.println(arr[idx]);
        //recursive
        printarr(arr, idx+1 );
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

     printarr(arr, 4);
        // int[] arr ={5,6,7,8,9,10};
        // printarr(arr, 4);

        
    }
    
}
