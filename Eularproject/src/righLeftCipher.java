import java.io.*;
import java.util.*;

public class righLeftCipher {
 public static void main(String[] arg) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String s = br.readLine();
     String s1="";
     int n = s.length();
     int mid= (n-1)/2;
     s1+=s.charAt(mid);
     int i =mid,j=mid;
     while(true){
         if(s1.length()!=n){
             j++;
             s1+=s.charAt(j);
         }
         else
             break;
         if(s1.length()!=n){
             i--;
             s1+=s.charAt(i);
         }
         else
             break;
     }        
     System.out.println(s1);
     
     
     
 }
}
