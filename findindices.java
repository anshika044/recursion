package recursion;
import java.util.*;
public class findindices {

    static void allindices(int []arr, int n, int target, int idx){
        if(idx>=n){
            return;
        }
        //self
        if(arr[idx]==target){
            System.out.println(idx); 
        }

        //recursive
        allindices(arr, n, target, idx+1);
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
     System.out.println(" target ");
     int target= sc.nextInt();

     allindices(arr, size, target, 0);
    }
}
