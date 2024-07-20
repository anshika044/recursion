package recursion;
import java.util.*;
public class arraylist {
    static ArrayList<Integer> allindices(int []arr, int n, int target,int idx){
        ArrayList<Integer> ans = new ArrayList<>();
     //base
     if(idx>=n){
     return ans;
     }

     //self
     if(arr[idx]==target){
        ans.add(idx);
     }
     //recurse
     ArrayList<Integer> smallans=allindices(arr, n, target, idx+1);
     ans.addAll(smallans);
     return ans;
    }

    public static void main(String[] args) {
        int arr[]= {1,4,4,3,4,4};
        int target=4;
        int n =arr.length;
        ArrayList<Integer> ans =allindices(arr, n, target, 0);
        for(Integer i: ans){
            System.out.println(i);
        }
    }
    
}
