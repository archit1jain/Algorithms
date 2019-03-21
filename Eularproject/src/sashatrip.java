import static java.lang.Integer.min;
import java.util.*;
public class sashatrip {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        if(v>=n-1){
            System.out.println(min(v,n-1));
            return;
        }
        int sum = v-1;
        int m =n-v;
        sum+=(m*(m+1))/2;
        System.out.println(sum);
        
        
    }
}
