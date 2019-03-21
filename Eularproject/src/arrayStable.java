import static java.lang.Math.*;
import java.util.*;
public class arrayStable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int j=0,k=0;
        int l1 = Integer.MAX_VALUE;
        int r1 = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]<l1){l1=a[i];j=i;}
            if(a[i]>r1){r1=a[i];k=i;}
        }
   
        int l2 = Integer.MAX_VALUE;
        int r2 = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
           if(i!=j && a[i]<l2) l2 = a[i];
           if(i!=k && a[i]>r2) r2 = a[i];
        }
        System.out.println(min(r1-l2,r2-l1));
    }
}