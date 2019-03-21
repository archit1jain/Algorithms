import java.util.*;
/**
 *
 * @author Archit
 */
public class waterBuying {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q!=0){
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long sum = 0;
            if(n%2!=0){n--;sum+=a;}
            a=a*n+sum;
            b=b*(n/2)+sum;
            if(a>b)System.out.println(b);
            else System.out.println(a);
            q--;
        }
    }
}
