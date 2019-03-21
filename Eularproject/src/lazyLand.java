import java.util.*;
public class lazyLand {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] b = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<k;i++){
            int key = sc.nextInt();
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else
                map.put(key,1);
            b[i]=key;
        }
    }
    
}
