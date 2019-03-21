import java.util.*;
public class sasharelax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] d = new int[n+1];
        d[0]=0;
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
            d[i+1]=a[i]^d[i];
        }
        int sum =0;
        int x = 1;
        while(x<=n){
            for(int i =1;i<=n-x;i++){
                int mid = (i+i+x-1)/2;
                if((d[i-1]^d[mid])==(d[i+x]^d[mid])) sum++;
            }
            x+=2;
        }
        System.out.println(sum);
    }
}
