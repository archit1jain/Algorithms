import java.math.BigInteger;
import java.util.*;
public class fibnoccii {
    static BigInteger fib(BigInteger n){
        if(n==1 || n==2)
            return BigInteger.ONE;
        else
            return fib(n-1).add(fib(n-2));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger l = BigInteger.ONE;
        while(String.valueOf(fib(l)).length()!=n)
            l.add(BigInteger.ONE);
        System.out.println(l);
    }
}
