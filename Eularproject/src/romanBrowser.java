import java.util.*;
public class romanBrowser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int max = 0;
        int l=0;
        for(int i =0;i<k;i++){
            int j =i;
            l =0;
            while(j<n){
                l+=a[j];
                j+=k;
            }
            l = sum - l;
            if(l<0) l*= -1;
            if(l>max) {
                max =l;
            }
        }
        System.out.println(max);
    }

    private static int max(int sum, int max) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
