import static java.lang.Math.*;
import java.math.BigInteger;
import java.util.*;
public class marvolo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long[] a = new long[3];
        for(int i =0;i<3;i++)a[i]=sc.nextInt();
        long maxp = Long.MIN_VALUE;
        long minp = Long.MAX_VALUE;
        long maxn = Long.MIN_VALUE;
        long minn = Long.MAX_VALUE;
        long countp=0,countn=0;
        for(long i =0;i<n;i++){
            long key = sc.nextInt();
            if(key<=0){minn=min(key,minn);maxn=max(key,maxn);countn++;}
            if(key>=0){minp=min(key,minp);maxp=max(key,maxp);countp++;}
        }
        BigInteger sum=BigInteger.ZERO;
        if(countp==0){
            for(int i =0;i<3;i++){
                if(a[i]>=0){
                        sum = sum.add(BigInteger.valueOf(a[i]*maxn));
                    }
                else{
                    sum = sum.add(BigInteger.valueOf(a[i]*minn));
                }
            }
            
        }
        else if(countn==0){
            for(int i =0;i<3;i++){
                if(a[i]>=0)
                        sum = sum.add(BigInteger.valueOf(a[i]*maxp));
                else
                    sum = sum.add(BigInteger.valueOf(a[i]*minp)); 
            }
            }
        else{
            for(int i =0;i<3;i++){
                if(a[i]>=0)
                        sum = sum.add(BigInteger.valueOf(a[i]*maxp));     
                else
                    sum = sum.add(BigInteger.valueOf(a[i]*minn));
             }
            
    }
        System.out.println(sum);
    }
}
