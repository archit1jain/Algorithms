import java.util.*;
public class ehabConst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        int[] a = new int[n];
        a[0]=sc.nextInt();
        int count =0;
        for(int i =1;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]!=0)
                count++;
        }
        Arrays.sort(a);
        int i;
        for(i =0;i<n;i++){
            if(a[i]!=0)
                break;
        }
        for(int j =0;j<k;j++){
            System.out.println(a[i]);
            a[i]--;
            if(a[i]==0 && i<n-1)
                i++;
        }
    }
}
