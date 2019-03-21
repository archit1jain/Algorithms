import static java.lang.Integer.max;
import static java.lang.Integer.min;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;
public class avgPower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigDecimal avg = BigDecimal.ZERO;
        int n = sc.nextInt(),k = sc.nextInt(),m = sc.nextInt();
        int[] a = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
            avg = avg.add(BigDecimal.valueOf(a[i]));
            max = max(max,a[i]);
        }
        Arrays.sort(a);
        int i =0;
        while(i<n && m>0 && a[i]!=max){
            avg = avg.subtract(BigDecimal.valueOf(a[i]));
            i++;
            m--;
        }
        i--;
        
        if(m>0){
            avg = avg.add(BigDecimal.valueOf(min(m,k*(n-i-1))));
            m-=m;
        }
        avg = avg.divide(BigDecimal.valueOf(n-i-1),MathContext.DECIMAL64);
        System.out.println(avg);
    }
}
