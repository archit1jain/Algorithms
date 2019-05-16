import java.util.*;
/**
 *
 * @author Archit
 */
public class prfixSumPrice {
    public static boolean isprime(int n){
        for(int i =2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[2];
        for(int i =0;i<n;i++)a[sc.nextInt()-1]++;
        int sum = a[0]+2*a[1];
        int recent = 0;
        if(a[1]!=0)recent =2;
        else if(a[0]!=0) recent =1;
        System.out.print(recent + " ");
        a[recent-1]--;
        while(a[0]!=0 && a[1]!=0){
            if(isprime(recent+1)){
                a[0]--;
                System.out.print(1+" ");
                recent++;
            }
            else{
                a[1]--;
                System.out.print(2+ " ");
                recent=recent+2;
            }
        }
        if(a[0]!=0)while(a[0]!=0){System.out.print(1+ " ");a[0]--;}
        if(a[1]!=0)while(a[1]!=0){System.out.print(2+ " ");a[1]--;}
    }
}
