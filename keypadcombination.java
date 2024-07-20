package recursion;
import java.util.*;

public class keypadcombination {
    static void combination(String dig, String[] kp, String result){
        //base
        if(dig.length()==0){
            System.out.println(result);
            return;
        }

        //oth index selfwork
        //bcoz its string you need to convert it into int
        int currnum= dig.charAt(0)-'0';//2
        String currchoices= kp[currnum]; //'abc'

        for(int i=0; i<currchoices.length(); i++){
            combination(dig.substring(1), kp, result+currchoices.charAt(i));
        }
        
    }

    public static void main(String[] args) {
        String dig="235";
        //kp[2]="abc"
        String[] kp = {"", "" , "abc", "def","ghi","jkl","mno","pqrs","uvw","xyz"};
        combination(dig, kp, "");
    }
    
}
