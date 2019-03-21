
import java.util.Scanner;


public class elevator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = 10000000,energy = 0;
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)
            a[i]=sc.nextInt();
        for(int x =0;x<n;x++){
           for(int i=0;i<n;i++){
               if(x>i)
                   energy = energy + a[i]*2*x*2;
               else
                   energy = energy + a[i]*2*i*2;
               }
           if(energy<min)
                   min = energy;
               energy =0;
           
        }
        System.out.println(min);
    }
}
