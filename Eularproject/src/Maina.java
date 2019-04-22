import java.util.*;
public class Maina {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();if(n>10)return;
        int[] a = new int[n];
        int max=0;
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();if(a[i]<1 || a[i]>=1000)return;
            if(max<a[i])
            max=a[i];
        }
        int[] dp = new int[max+1];
        dp[0]=1;
        dp[1]=1;
        for(int i =2;i<max+1;i++){
            dp[i]=(dp[i-1]*i)%107;
        }
        long sum =0;
        for(int i =0;i<n;i++){
            a[i]=dp[a[i]];
            sum+=a[i];
            sum%=107;
        }
        sum%=107;
        System.out.println(sum);
    }
}