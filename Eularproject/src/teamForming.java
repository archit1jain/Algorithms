import java.util.*;
public class teamForming {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum =0;
        Arrays.sort(a);
        for(int i =1;i<n;i=i+2){
            sum += a[i]-a[i-1];
        }
        System.out.println(sum);
    }
}
