import static java.lang.Math.max;
import java.util.*;
public class accordian {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int l = s.length();
      int l1=0;
      while(l1<l && s.charAt(l1)!='[') l1++;
      int l2=l1+1;
      while(l2<l && s.charAt(l2)!=':') l2++;
      int r1 = l-1;
      while(r1>=0 && s.charAt(r1)!=']') r1--;
      int r2 = r1-1;
      while(r2>=0 && s.charAt(r2)!=':') r2--;
      if(r2<=l2){
          System.out.println(-1);
      }
      else{
          int res =4;
          for(int i =l2+1 ; i<r2 ; i++){
              if(s.charAt(i)=='|')
                  res++;
          }
          System.out.println(res);
      }
  }
}
