package recursion;
import java.util.*;
public class lastindex {

    static int lastindice(int []arr, int n,int target, int idx){
        //base
        if(idx==n){
            return -1;
        }
        //self
        if(arr[idx]==target){
            return idx;
        }
        //recurse
        return lastindice(arr, n, target, idx-1);

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
        System.out.println("target");
        int target=sc.nextInt();
        System.out.println(lastindice(arr, size, target, -1));

    }
    
}
