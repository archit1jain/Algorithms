import java.util.*;
/**
 *
 * @author Archit
 */
public class PCJ18B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            long sum=0;
            for(int i =1;i<=n;i=i+2){
                sum+=(n+1-i)*(n+1-i);
            }
            System.out.println(sum);
            t--;
        }
    }
}
