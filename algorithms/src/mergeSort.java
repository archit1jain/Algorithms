import java.util.*;
public class mergeSort {
    public static int[] mergesort(int[] a){
        int l = a.length-1;
        if(l==0) return a;
        int m = l/2;
        int[] b = new int[m+1];
        int[] c = new int[l-m];
        for(int i =0;i<m+1;i++)b[i]=a[i];
        for(int i =m+1;i<=l;i++)c[i-m-1]=a[i];
        int[] d = merge(mergesort(b),mergesort(c));
        return d;
    }
    public static int[] merge(int[] b,int[] c){
        int l =b.length;
        int m = c.length;
        int[] d = new int[l+m];
        int i =0;
        int j =0;
        int k = 0;
        while(i<l+m && j<l && k<m){
            if(b[j]<=c[k]){
                d[i]=b[j];i++;j++;
            }
            else if(b[j]>=c[k]){
                d[i]=c[k];k++;i++;
            }
        }
        if(j!=l){
            while(j!=l && i<l+m){
                d[i]=b[j];j++;i++;
            }
        }
        if(k!=m){
            while(k!=m && i<l+m){d[i]=c[k];k++;i++;
            }
        }
        return d;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        System.out.print(Arrays.toString(mergesort(a)));
    }
}
