import java.util.*;
public class combinationalLock {
    static boolean rotate(int i,int[] arr,int a,boolean flag){
        if(flag==true)
            return true;
        int c=0,ac=0,n = arr.length;
        c+=arr[i];
        ac-=arr[i];
        if(i==n-1){
            if(c%360==0 || ac%360 ==0){
                return true;
            }
            else 
                return false;
        }
        if(i<n-1)
            i++;
        flag = rotate(i,arr,c,flag);
        flag = rotate(i,arr,ac,flag);
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(rotate(0,arr,0,false))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
