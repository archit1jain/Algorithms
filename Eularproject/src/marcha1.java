import java.util.*;
/**
 *
 * @author Archit
 */
public class marcha1 {
    public static boolean solve(int[] a, int start, int m){
        if(m==0)return true;
        if(start==a.length)return false;
        if(a[start]==m)return true;
        return solve(a,start+1,m)||solve(a,start+1,m-a[start]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n =sc.nextInt(),m=sc.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n;i++)a[i]=sc.nextInt();
            if(solve(a,0,m))System.out.println("Yes");
            else System.out.println("No");
            t--;
        }
    }
}
