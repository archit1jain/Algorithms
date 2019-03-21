import static java.lang.Integer.max;
import java.util.*;
/**
 * @author Archit
 */
public class bestSubsequence {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       long[] a = new long[n];
       int count =0,c=0;
       long max = Long.MIN_VALUE;
       for(int i =0;i<n;i++){a[i] = sc.nextLong();if(max<a[i])max = a[i];}
       for(int i =0;i<n;i++){
           if(a[i]==max){
               count++;
           }
           else{
               c = max(count,c);
               count=0;
           }
           c = max(count,c);
           
       }
       
       System.out.println(c);
   } 
}
