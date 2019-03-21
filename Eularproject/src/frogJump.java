import java.util.*;
public class frogJump {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long k = sc.nextInt();
            long res = (k/2)*(a-b);
            if(k%2!=0){
                res+=a;
            }
            System.out.println(res);
        }
    }
}
