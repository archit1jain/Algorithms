import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
import java.math.BigInteger;
public class newYearSphere {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        long nl = (long) Math.sqrt(n);
        List<Long> l1 = new ArrayList<>();
        for(long i =1;i<=nl;i++){
            if(n%i==0){
                /*
                long n2 = n/i;
                long n3 = (long)(((double)n2/2)*(2+(((double)n2)-1)*i));
                long n4 = (long)(((double)i/2)*(2+(((double)i)-1)*n2));
                System.out.print(n4);
                System.out.print(" ");
                if(n3!=n4)
                l1.add(n3);
                */
                l1.add(i);
                if(i!=n/i)
                    l1.add(n/i);
            }
        }
        Collections.sort(l1);
        long l = l1.size()-1;
        for(long i = l;i>=0;i--){
                long n4 = l1.get((int)i);
                long n2 = (long)((double)n/n4);
                BigDecimal bg1 = BigDecimal.valueOf((double)n2/2);
                BigDecimal bg2 = BigDecimal.valueOf((((double)n2)-1)*n4);
                BigInteger n3 = ((bg1.multiply(bg2.add(BigDecimal.valueOf(2))))).toBigInteger();
                
                
                System.out.print(n3+ " ");
                
                
            /*
            System.out.print(l1.get((int)i) + " ");
            */
        }
                
    }
}
