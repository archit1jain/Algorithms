import java.io.IOException;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException{
        int n,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            int v = sc.nextInt();
            if(map.containsKey(v))
               map.put(v,map.get(v)+1);
            else
                map.put(v,1);
        }
        int max = Collections.max(map.values());
        float m = (float)max/k;
        int l = (int) Math.ceil(m);
        max = k*l*map.size();
        System.out.println(max-n);     
    }
    
}
