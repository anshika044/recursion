package recursion;
import java.util.*;


public class issorted {

    static boolean sorted(int[] arr, int n,int idx){

        //base
        if(idx==n-1){
            return true;
        }
        //self
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        //recursive
        return sorted(arr, n, idx+1);
    }
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
     System.out.println(" enter size ");
     int size = sc.nextInt();

     int [] arr = new int[size];

     //input
     for(int i =0; i<size;i++){
        arr[i]=sc.nextInt();
     } 

     if(sorted(arr, size, 0)){
        System.out.println("sorted");
     }else{
        System.out.println("not sorted");
     }
}
}