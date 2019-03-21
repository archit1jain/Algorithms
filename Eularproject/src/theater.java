import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class theater {
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     BigDecimal n = sc.nextBigDecimal();
     BigDecimal m = sc.nextBigDecimal();
     BigDecimal a = sc.nextBigDecimal(); 
     n  = n.divide(a,RoundingMode.CEILING);
     m  = m.divide(a,RoundingMode.CEILING);
     
     System.out.println(m.multiply(n));
 }   
}