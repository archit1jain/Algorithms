import static java.lang.Math.max;
import java.util.*;
public class zuharString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> map = new HashMap<>();
        String s = sc.nextLine();
        int max = 0;
        for(int i =0;i<n-k+1;i++){
            String s1 = s.substring(i,i+k);
            boolean flag = true;
            for(int j =i;j<i+k;j++){
                if(s.charAt(i)!=s.charAt(j)){
                    flag = false;
                    i = j-1;
                    break;
                    
                }
            }
            if(flag ==true){
                i=i+k-1;
                if(map.containsKey(s1)) map.put(s1,map.get(s1)+1);
                else map.put(s1,1);
                max = max(map.get(s1),max);
          
            }
            
        }
        System.out.println(max); 
        
        

    }
    
    
}
