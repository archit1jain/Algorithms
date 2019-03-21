import java.util.*;
/**
 *
 * @author Archit
 */
public class game23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        n = m/n;
        long count=0;
        while(n%2==0){n/=2;count++;}
        while(n%3==0){n/=3;count++;}
        if(n==1)System.out.println(count);
        else System.out.println(-1);
        
    }
}
