package recursion;
import java.util.*;

public class removeA { 

    static String removeA2(String s){
        //base
        if(s.length()==0){
            return "";
        }

        //rec
        String smallans= removeA2(s.substring(1));
        char currchar=s.charAt(0);
    //selfwork
    if(currchar!='a'){
        return currchar+smallans;
    }else{
        return smallans;
    }

    }
static String removeoccurrence(String s,int idx){
    //base
    if(idx==s.length()){
        return " ";
    }
    //recursive
    String smallans=removeoccurrence(s, idx+1);
    
    
    char currchar=s.charAt(idx);
    //selfwork
    if(currchar!='a'){
        return currchar+smallans;
    }else{
        return smallans;
    }
    

}


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeoccurrence(s, 0));
        System.out.println(removeA2(s));
    }
    
}
