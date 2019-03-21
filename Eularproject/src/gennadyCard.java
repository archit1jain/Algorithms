import java.io.*;
import java.util.Arrays;
public class gennadyCard {
  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s = br.readLine().trim();
      String s1 = br.readLine().trim();
      String[] s2 = s1.split(" ");
      System.out.println(Arrays.toString(s2));
      for(String str: s2){
          str=str.trim();
          if(str.charAt(0)==s.charAt(0) || str.charAt(1)==s.charAt(1)){
              System.out.println("YES");
              return;
          }
      }
      System.out.println("NO");
  }  
}
