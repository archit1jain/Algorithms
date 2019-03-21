import java.math.BigInteger;
import java.util.*;
public class tralingLove {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger(),b = sc.nextBigInteger();
        BigInteger m = BigInteger.valueOf(1);
        BigInteger i = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(0);
        while(n.compareTo(i)>=0){
            if(m.compareTo(b)>=0 && m.mod(b).compareTo(BigInteger.valueOf(0))==0){
                m = m.divide(b);
                c = c.add(BigInteger.valueOf(1));
            }
            i = i.add(BigInteger.valueOf(1));
            m = m.multiply(i);
        }
        System.out.println(c);
        
    }
}
