import java.util.*;
public class viewMatters {
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     long sum =0;
     long m = sc.nextLong();
     long[] a = new long[n];
     for(int i =0;i<n;i++){
         a[i]=sc.nextLong();
         sum+=a[i];
     }
         
     Arrays.sort(a);
     
     
 }   
}
