import java.util.*;
public class arraypartition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        Long[] a = new Long[n];
        Long[] b = new Long[n];
        for(int i =0;i<n;i++){
        long key = sc.nextInt();
        a[i]=key;
        b[i]=key;
        }
        Arrays.sort(b);
        HashMap<Long,Integer> map = new HashMap<>();
        int j =n-1;
        long sum=0;
        for(int i =0;i<m*k;i++){
            if(j>=0) {
                if(map.containsKey(b[j]))map.put(b[j],map.get(b[j])+1);
                else map.put(b[j],1);
                sum+=b[j];
            }
                j--;
        }
        System.out.println(sum);
        int l=0;
        for(int i =0;i<k-1;i++){   
            int key = m;
            while(key>0 && l<a.length){
                if(map.containsKey(a[l])){
                    if(map.get(a[l])==1) map.remove(a[l]);
                    else map.put(a[l],map.get(a[l])-1);
                    key--;
                    l++;
                    
                }
                else{
                    l++;
                }
               
            }
             System.out.print(l+" ");
        }
        
        
        
    }
}
