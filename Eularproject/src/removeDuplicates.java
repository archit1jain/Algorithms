import java.util.*;
public class removeDuplicates {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        /*
        [1,1,2,3,3,3,4,5] ->[1,2,3,4,5,1,3,3]
        
        */
        int i =0,j=1;
        while(j<a.length){
            if(a[i]==a[j]){
                j++;
            }
            
        }
            
        
    }
}
