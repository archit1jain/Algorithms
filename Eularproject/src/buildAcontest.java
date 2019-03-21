import java.util.*;
public class buildAcontest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int m =sc.nextInt();
        for(int i =0;i<m;i++){
            int a =sc.nextInt();
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
            if(map.size()==n){
                System.out.print("1");
                for(int j =1;j<=n;j++){
                    if(map.get(j)==1)
                        map.remove(j);
                    else
                        map.put(j,map.get(j)-1);
                }
            }
            else{
                System.out.print("0");
            }
        }
        
    }
}
