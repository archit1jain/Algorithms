import java.util.*;
public class fruits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++) a[i]=sc.nextInt();
        Arrays.sort(a);
        sc.nextLine();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i =0;i<m;i++){
            String key = sc.nextLine().trim();
            if(map.containsKey(key)) map.put(key,map.get(key)+1);
            else map.put(key,1);
        }
        List<Integer> l1 = new ArrayList<>();
        for(Map.Entry<String,Integer> e : map.entrySet()){
           l1.add(e.getValue());
        }
        Collections.sort(l1,Collections.reverseOrder());
        int l = l1.size()-1;
        int i=0,max=0,min=0;
        while(m!=0){
            int d = l1.get(i);
            min = min + d*a[i];
            max = max + d*a[n-i-1];
            i++;
            m-=d;
        }
        System.out.println(min + " " + max);
    }
}
