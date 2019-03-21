import java.util.*;
public class arrayKcol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5001];
        int n = sc.nextInt(),k=sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] c = new int[n];
        for(int i =0;i<n;i++){
            int key = sc.nextInt();
            c[i]=key;
            a[key]++;
            if(a[key]>k){System.out.println("No");return;}
        }
        for(int i =0;i<n;i++){
            if(map.containsKey(c[i])){
                map.put(c[i],((map.get(c[i])+1)%k));
                System.out.print((map.get(c[i])+1)+ " ");
            }
            else{
                map.put(c[i],(i)%k);
                System.out.print((map.get(c[i])+1)+ " ");
            }
        }
        
    }
}
