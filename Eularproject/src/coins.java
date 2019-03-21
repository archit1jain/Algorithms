import java.util.*;
public class coins {
    public static void main(String[] args){
        long n,s;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        s = sc.nextLong();
        long m = (long)Math.ceil((double)(s)/n);
        System.out.println(m);
    }
    
}
