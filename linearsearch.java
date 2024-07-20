package recursion;
import java.util.*;
public class linearsearch {

    static boolean linear(int [] arr, int n, int target , int idx){


        //self work
        if(idx>=n){
            return false;
        }

        //self work
        if(arr[idx]==target){
            return true;
        }

        //recurse
        return linear(arr, n, target, idx+1);
    //     if(linear(arr, n, target, idx+1)){
    //         return true;
    //     }else
    //     return false;
    }
//return index of target if target present in array , otherwise return -1
static int search(int [] arr , int n, int target, int idx){
    if(idx>=n){
        return -1;
    }

    //self
    if(arr[idx]==target){
        return idx;
    }
    //recurse
    return search(arr, n, target, idx+1);
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

     if(linear(arr, arr.length, target, 0)){
        System.out.println("yes");
     }else{
        System.out.println("no");
     }
     System.out.println(search(arr, size, target, 0));
    }
    
}
