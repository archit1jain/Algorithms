
import static java.lang.Integer.*;
import java.util.*;
public class sashaMAgnetic {
    public static int chck(int n){
        int m = (int) Math.sqrt(n);
        for(int i = m;i>=2;i--)
            if(n%m==0) return i;
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int x;
        int sum = 0;
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
            min = min(a[i],min);
            if(a[i]>max && chck(a[i])!=-1){
                max = a[i];
            }
            sum+=a[i];
        }
        sum-=min;
        sum-=max;
        x = chck(max);
        max/=x;
        min*=x;
        sum = sum+min+max;
        System.out.println(sum);
    }
}
