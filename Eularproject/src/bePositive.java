import java.util.*;
/**
 *
 * @author Archit
 */
public class bePositive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nv=0,pv=0;
        for(int i =0;i<n;i++){
            int key = sc.nextInt();
            if(key>0)pv++;
            if(key<0)nv++;
        }
        if(n%2==0)n/=2;
        else n=(n/2)+1;
        if(pv>=n)System.out.println(1);
        else if(nv>=n)System.out.println(-1);
        else System.out.println(0);
    }
}
