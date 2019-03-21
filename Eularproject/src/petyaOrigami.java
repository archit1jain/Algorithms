import java.util.*;
public class petyaOrigami {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double k = sc.nextInt();
        long res = (long)Math.ceil((double)(n*2)/k)+(long)Math.ceil((double)(n*5)/k)+(long)Math.ceil((double)(n*8)/k);
        System.out.print(res);
    }
}
