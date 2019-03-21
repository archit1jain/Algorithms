import static java.lang.Math.*;
import java.util.*;
public class kvass {
    public static void main(String[] args){
        long s,s1,sum,min;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextLong();
        s1 = s;
        List<Long> l1 = new ArrayList<>();
        min = sc.nextLong();
        l1.add(min);
        sum = min;
        for(int i =1;i<n;i++){
            long k = sc.nextLong();
            
            if(k>min){
                s-= k-min;
            }
            else{
                s-= (min-k)*l1.size();
                min = k;
            }
            l1.add(k);
            sum+=k;
            if(s<=0){
                min = l1.indexOf(min);
                System.out.println(l1.get((int)min));
                return;
            }
        }
        
        if(sum<s1){
            System.out.println(-1);
            return;
        }
        min = l1.indexOf(min);
        while(s>0 && l1.get((int) min)!=0){
            s -= n;
            l1.set((int) min, l1.get((int)min)-1);
        }
        if(s<=0){
            System.out.println(l1.get((int)min));
        }
        
    }
    
}
