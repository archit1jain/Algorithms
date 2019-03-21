import java.util.*;
public class lyftTaxi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[n+m];
        int[] t = new int[n+m];
        int[] res = new int[m];
        List<Integer> l1 = new ArrayList<>();
        for(int i =0;i<n+m;i++)
            x[i]=sc.nextInt();
        for(int i =0;i<n+m;i++){
            t[i]=sc.nextInt();
            if(t[i]==1)
                l1.add(i);
        }
        int count=0;
        for(int i =0;i<n+m;i++){
            
        }
    }
}
