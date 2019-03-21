import java.util.*;
/**
 *
 * @author Archit
 */
public class tanyaCan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        long sum =0;
        long sum1 = 0;
        long b[][] = new long[n][2];
        long c[][] = new long[n][2];
        for(int i =0;i<n;i++){
                if(i%2==0)sum+=a[i];
                else sum1+=a[i];
                b[i][0] = sum;
                b[i][1] = sum1;
        }
        sum=0;
        sum1 = 0;
        for(int i =n-1;i>=0;i--){
                if(i%2==0)sum+=a[i];
                else sum1+=a[i];
                c[i][0] = sum;
                c[i][1] = sum1;
        }
        int count =0;
        for(int i =0;i<n;i++){
             sum=0;
             sum1 = 0;
           if(i-1>=0)sum+=b[i-1][0];
           if(i+1<n)sum+=c[i+1][1];
           if(i-1>=0)sum1+=b[i-1][1];
           if(i+1<n)sum1+=c[i+1][0];
           if(sum==sum1){count++;}
        }
        System.out.println(count);
        
    }
}
