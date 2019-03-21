import java.util.*;
public class splitEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i =0;i<n;i++) a[i]=sc.nextInt();
        
        int j =0;
        for(int i = k;i<n;i++){
            b[j]=a[i];
            j++;
        }
        for(int i =0;i<k;i++){
            b[j]=a[i];
            j++;
        }
        System.out.println(Arrays.toString(b));
            
    }
}
