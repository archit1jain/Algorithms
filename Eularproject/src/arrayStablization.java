import static java.lang.Math.*;
import java.util.*;
public class arrayStablization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        System.out.println(min(a[n-1]-a[1],a[n-2]-a[0]));
    }
}
