
import static java.lang.Math.max;
import java.util.*;

public class largestProduct {
   static int mul(String s){
       int mul=1;
        for(int i =0;i<s.length();i++){
            mul*=Character.getNumericValue(s.charAt(i));
        }
        return mul;
    }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int max = 0;
      String res="";
      for(int i =0;i<s.length()-12;i++){
          int l = mul(s.substring(i,i+13));
          if(l>max)
            res  = s.substring(i,i+13);
            max = max(l,max);
      }
      System.out.println(res);
      System.out.println(max);
  }  
}
