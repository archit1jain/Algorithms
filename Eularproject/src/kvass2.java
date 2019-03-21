    import static java.lang.Math.*;
    import java.util.*;
    public class kvass2 {
        public static void main(String[] args){
            long k,s,s1,sum = 0,min;
            min = 999999999;
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            s = sc.nextLong();

            long[] v = new long[n];
            for(int i=0;i<n;i++){
                k = sc.nextLong();
                sum+=k;
                min = min(min,k);
            }
            if(sum<s){
                System.out.println(-1);
                return;
            }
            else{
                long t = sum-min*n;
                if(s<=t){
                    System.out.println(min);
                    return;
                }
                else{
                    s-=t;
                    System.out.println(min-(long)Math.ceil((double)s/n));
                    return;

                }

            }
        } 
    }