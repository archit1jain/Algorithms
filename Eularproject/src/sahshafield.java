
import static java.lang.Integer.*;
import java.util.*;
public class sahshafield{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        Arrays.sort(a);
        int j = n-1;
        int d = Integer.MAX_VALUE;
        while(j>0){
            for(int i = 1;i<=a[j];i++){
                if(a[j]%i==0)
                d = min(d,a[0]*i - a[0] -a[j] + a[j]/i);
            }
            j--;
        }
        System.out.println(sum+d);
    }
}
