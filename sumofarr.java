package recursion;

import java.util.Scanner;

public class sumofarr {

    static int sum(int [] arr, int idx){

        //self 
        if(idx==arr.length)
        return 0;
        //recurse
        int smallans = sum(arr, idx+1);
        //self
        return smallans+arr[idx];
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
     System.out.println(sum(arr, 0)); 
    }
    
}
