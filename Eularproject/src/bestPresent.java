import java.util.*;
public class bestPresent {
    public static long cal(long a){
        if(a%2==0){
            return a/2;
        }
        else
            return -(a+1)/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i =0;i<q;i++){
            long l = sc.nextLong();
            long r = sc.nextLong();
            long sum = cal(r)-cal(l-1);
            System.out.println(sum);
        }
    }
    
}
