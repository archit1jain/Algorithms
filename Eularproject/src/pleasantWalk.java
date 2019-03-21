import static java.lang.Math.max;
import java.util.*;
public class pleasantWalk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,k,key=1;
        n=  sc.nextInt();
        k=  sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int j,count = 1,i =0;
        while(i<n){
            for(j=i+1;j<n;j++){
                if(a[j-1]!=a[j]){
                    count++;
                }
                else{
                    break;
                }
            }
            key =  max(key,count);
            count =1;
            if(j==n)
                break;
            else
               i=j; 
        }
        System.out.println(key);       
    }
}
