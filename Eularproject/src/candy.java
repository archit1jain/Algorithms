import java.util.*;
public class candy {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int a[] = new int[k];
    int i =1,j =0;
    while(n!=0){
        if(i<=n){
            a[j]+=i;n-=i;
        }
        else{
            a[j]+=n;n-=n;
        }
        i++;j++;
        if(j==k)j=0;
    }
    System.out.println(Arrays.toString(a));
}    
}
