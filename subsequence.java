package recursion;
import java.util.*;

public class subsequence {

    static ArrayList<String> getssq(String s){
        ArrayList<String> ans= new ArrayList<>();
        //base
         if(s.length()==0){
            ans.add("");
            return ans;
         }

        //recurse
        char currchar= s.charAt(0);//a
        ArrayList<String> smallans = getssq(s.substring(1));//bc

        //smallans= ["bc","b","c",""]
        //ans=["bc","abc","b","ab","c","ac","","a"]
        for(String ss: smallans){
            ans.add(ss);
            ans.add(currchar+ss);
        }
        return ans;
        

    }

    public static void main(String[] args) {
        ArrayList<String> ans=getssq("abcd");
        for(String ss: ans){
            System.out.println(ss);
        }
    }
    
}
