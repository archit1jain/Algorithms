import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author Archit
 */
public class emotes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long m = sc.nextLong();
        long[] a = new long[n];
        long max = 0;
        int count =0;
        for(int i =0;i<n;i++){
            a[i]=sc.nextLong();
            if(a[i]>max)max = a[i];
        }
        long max1=0;
        for(int i =0;i<n;i++){
            if(a[i]>max1 && a[i]!=max)max1 = a[i];
            if(a[i]==max)count++;
        }
        if(count >1){
            BigInteger b = BigInteger.valueOf(max).multiply(BigInteger.valueOf(k));
            System.out.println(b);
        }
        else{
            m = k/(m+1);
            k = k-m;
            BigInteger b = (BigInteger.valueOf(max).multiply(BigInteger.valueOf(k))).add(BigInteger.valueOf(max1).multiply(BigInteger.valueOf(m)));
            System.out.println(b);
        }
    }
}
