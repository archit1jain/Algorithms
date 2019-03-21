import java.util.*;
/**
 *
 * @author Archit
 */
public class seaBattle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long w1=  sc.nextLong(),h1=sc.nextLong(),w2=sc.nextLong(),h2=sc.nextLong();
        System.out.println(2*w1+2*h1+2*h2+4);
    }
}
