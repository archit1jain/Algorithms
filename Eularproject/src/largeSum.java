import java.math.BigInteger;
import java.util.*;
public class largeSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger b1 = BigInteger.ZERO;
        for(int i =0;i<100;i++){
            String s = sc.nextLine();
            b1=b1.add(BigInteger.valueOf(Long.valueOf(s.substring(50))));
            
        }
        System.out.println(b1);
    }
}
