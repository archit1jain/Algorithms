import static java.lang.Math.*;
import java.util.*;
public class walk2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,k,key=1;
        n = sc.nextInt();
        k = sc.nextInt();
        int j;
        List<Integer> a = new ArrayList<>();
        int i=0;
        while(i<n){
            j = sc.nextInt();
            if(a.size()>1){
             if(a.get(a.size()-2)==a.get(a.size()-1)){
                 int count = a.size();
                 key = max(count,key);
                 a.clear();
             }
             else
                 a.add(j);
            }
            i++;
        }
        System.out.println(a);
        System.out.println(key);
        
        
    }
}
