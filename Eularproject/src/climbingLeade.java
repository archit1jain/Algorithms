import java.util.*;
public class climbingLeade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> scores = new ArrayList<>();
        scores.add(sc.nextInt());
        int m1 =0;
        for(int i=1;i<n;i++){
            int k = sc.nextInt();
            if(scores.get(m1)!=k){
                scores.add(k);
                m1++;
            }
                
        }
        int m = sc.nextInt();
        int[] a = new int[m];
        for(int i =0;i<m;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i = 0;i<a.length;i++){
            
            while(k>=0 && a[i]>=scores.get(k)){
                k--;
            }
            System.out.println(k+2);
            
        }
    }
}
