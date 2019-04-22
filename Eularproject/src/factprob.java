import java.util.*;
public class factprob {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t>0)
        {
        long n=sc.nextLong(), k=sc.nextLong();
        long inf = 10000000;
        long ans = inf;
        long mp = 1;
        for(long i=2; i*i<=k; i++) //prime factors less than sqrt(k)
        {
            if(k % i == 0) // a prime factor is i.
            {
                mp = 0; // number of occurences of i in k.
                while(k % i == 0)
                {
                    mp++;
                    k /= i;
                }
                long tmp = 0;
                long p = i;
                while(p <= n)
                {
                    tmp += n / p;
                    p*=i;
                }
                ans = Math.min(ans, tmp / mp); 
            }
        }
        if(k > 1) // prime factor greater than sqrt(k).
        {
            long tmp = 0;
            long p = k;
            while(p <= n)
            {
                tmp += n / p;
                p *= k;
            }
            ans = Math.min(ans, tmp);
        }
        if(ans == inf)
            ans = 0;
        System.out.println(ans);
        t--; 
        }
   }
 }