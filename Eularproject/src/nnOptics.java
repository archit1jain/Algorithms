import static java.lang.Math.sin;
import java.util.*;
public class nnOptics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n=sc.nextInt();
        double r=sc.nextInt();
        /*
        2pieR/n = 2pie(r+R)/n
        sinq = R/r+R
        rsinq +Rsinq = R
        R = rsinq/1-sinq;
        
        */
        double q = Math.PI/n;
        double r1 = r*sin(q);
        r1 = r1/(1-sin(q));
        System.out.println(r1);
        
    }
}
