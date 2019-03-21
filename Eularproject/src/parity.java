import java.util.*;
public class parity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int k = sc.nextInt();
        int s =0;
        for(int i =0;i<k-1;i++){
               int a =sc.nextInt();
               s = (s+b*a)%2;
        }
        s+=sc.nextInt();
        s=s%2;
        if(s==0) System.out.println("even");
        else System.out.println("odd");
        
    }
}
