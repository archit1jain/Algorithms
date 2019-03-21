
import java.util.*;


public class smallestMultiple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        int l =1;
        for(int i =2;i<=n;i++){
            int m =i;
            for(int j =0;j<l1.size();j++){
                if(m%l1.get(j)==0){
                    m=m/l1.get(j);
                }
                    
            }
            
            l1.add(m);
            l*=m;
        }
        System.out.println(l);
    }
}
