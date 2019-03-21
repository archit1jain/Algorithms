import java.util.*;
/**
 *
 * @author Archit
 */
public class maxcontrest {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] a = new int[2*n];
     for(int i =0;i<n;i++){
         a[i]=sc.nextInt();
         a[i+n]=a[i];
     }
     int i =0;
     int max = 0;
     int count =0;
     while(i<2*n){
         if(a[i]==1){
             count++;
         }
         else{
             max = Math.max(max, count);
             count =0;
         }
         i++;
     }
     System.out.println(max);
    }
}
