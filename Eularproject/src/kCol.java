import java.util.*;
public class kCol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = k;
        int[] a = new int[n];
        boolean flag = true;
        HashMap<Integer,Integer> m1 = new HashMap<>();
        for(int i =0;i<n;i++){
            int key = sc.nextInt();
            a[i] = key;
            if(m1.containsKey(key)) 
                m1.put(key,(m1.get(key))-1);
            else
                m1.put(key,l--);
            int m = m1.get(key);
            if(m>k){
                flag = false;
                break;
            }
            a[i]=m;
                
        }
        if(flag==false) System.out.println("NO");
        else{
            System.out.println("YES");
        
            for(int i =0;i<n;i++){
                System.out.print(a[i]);
                System.out.print(" ");
            }    
    }
}
}

