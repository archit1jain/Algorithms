import java.util.*;
public class digitalRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            long k = sc.nextLong();
            long x = sc.nextLong();
            long m=x;
            /*while(count!=k){
                m=m+9;
                int s=m%9;
                if(s==0)s=9;
                if(s==x)count++;
            }
            */
            m+=(k-1)*9;
            System.out.println(m);
            t--;
            
        }
    }
}
