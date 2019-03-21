import java.util.*;
public class farewellParty {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++ ){
            int key = sc.nextInt();
            b[i]=key;
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else
                map.put(key,1);
        }
        for(int i : map.keySet()){
            if((n-i) != map.get(i)){
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
        int x =1;
        System.out.print(x+" ");
        for(int i =1;i<n;i++){
            if(b[i]==b[i-1]){
                System.out.print(x+ " ");
            }
            else{
                x++;
                System.out.print(x+ " ");
            }
        }
            
        }
}
        