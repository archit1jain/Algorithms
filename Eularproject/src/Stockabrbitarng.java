import java.util.*;
/**
 *
 * @author Archit
 */
public class Stockabrbitarng {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(),m=sc.nextInt(),r=sc.nextInt();
       int  max = 0;
       int min = Integer.MAX_VALUE;
       for(int i =0;i<n;i++){
           min=Math.min(sc.nextInt(),min);
       }
       for(int i =0;i<m;i++){
           max=Math.max(sc.nextInt(),max);
       }
       if(min>max)System.out.println(r);
       else{
           int share = r/min,rem=r%min;
           System.out.println(share*max+rem);
       }
    }
}
