import java.math.BigInteger;
import java.util.*;
public class book {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            long sum = 0;
            for(int i =1;i<=n;i++)
            sum+=sc.nextInt()/i;
            if(sum%2==0)
                System.out.println("Harshit");
            else 
                System.out.print("Aayush");
            t--;
        }
    }
}
