package Test;
import java.util.Scanner;
import static primespackage.Primes.checkForPrime;
public class TwinsPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit of the range.");
        int n = sc.nextInt();
        for(int i = 3;i<=n;i=i+2){
            if(checkForPrime(i) && checkForPrime(i+2)){
                System.out.println("("+i+","+(i+2)+")");
            }
        }
        
    }
}
