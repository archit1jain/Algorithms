import java.util.*;
public class numberDivision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        long sum =0;
        for(int i =0;i<n/2;i++){
            sum+=(a[i]+a[n-i-1])*(a[i]+a[n-i-1]);
        }
        System.out.println(sum);
    }
}
