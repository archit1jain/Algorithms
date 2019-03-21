import static java.lang.Math.max;
import java.util.*;
public class divisorTwo {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] a = new int[10001];
       int max= Integer.MIN_VALUE;
       for(int i =0;i<n;i++){
           int key = sc.nextInt();
           a[key]++;
           max = max(max,key);
       }
       int max1 = 0;
       for(int i =1;i<=10000;i++){
           if(max%i==0) a[i]--;
           if(a[i]==1) {
               max1 = max(max1,i);
           }
       }
       System.out.println(max + " " + max1);
    }
}
