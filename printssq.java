package recursion;
import java.util.*;

public class printssq {

    static void printssq(String s, String currans){

        //base
        if(s.length()==0){
            System.out.println(currans);
            return;
        }
        char currchar= s.charAt(0);
        String remstring=s.substring(1);
        printssq(remstring, currans+currchar);
        printssq(remstring, currans);
    }

    public static void main(String[] args) {
        printssq("abc", "");
    }
    
}
