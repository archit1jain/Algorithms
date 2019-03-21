import java.util.*;
public class largestPrime {
    static boolean isPrime(long n){
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        for(long j =(long)Math.sqrt(l);j>1;j--){
            if(l%j==0 && isPrime(j)){
                System.out.println(j);
                return;
            }
        }
        
    }
}
