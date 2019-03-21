import java.util.*;
public class lostArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int m=0;
        List<Integer> res = new ArrayList<>();
        for(int i =0;i<n;i++){
            int key = sc.nextInt();
            x[i]=key-m;
            m=key;
        }
        for(int i =1;i<=n;i++){
            int c =0;
            for(int j=0;j<n;j++){
            if(x[j%i]==x[j])
                c++;
        }
            if(c==n){
                res.add(i);
            }
            
        }
        System.out.println(res.size());
        for(int i =0;i<res.size();i++)
            System.out.print(" "+res.get(i));
    }
}
