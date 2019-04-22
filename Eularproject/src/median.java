import java.util.*;
public class median {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt(),m=sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for(int i =0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int j = 0;j<m;j++){
                b[j]=sc.nextInt();
            }
            ArrayList<Integer> l = new ArrayList<>();
            int i=0,j=0;
            while(i!=n && j!=m){
                if(a[i]<=b[j]){l.add(a[i]);i++;}
                else {l.add(b[j]);j++;}
            }
            if(i!=n)
                while(i!=n){l.add(a[i]);i++;}
            if(j!=m)while(j!=m){l.add(b[j]);j++;}
            System.out.println(l.get((m+n-2)/2));
            
            t--;
        }
    }
}
