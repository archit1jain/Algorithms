import java.util.*;
public class brutaility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long sum =0;
        long[] a = new long[n];
        List<Long> l = new ArrayList<>();
        for(int i =0;i<n;i++){
            a[i]=sc.nextLong();
            sum+=a[i];
        }
        sc.nextLine();
        String s = sc.nextLine();
        int len = s.length();
        int i =0;
        while(i!=len){
            int j =i+1;
            l.clear();
            l.add(a[i]);
            int count =1;
            if(j<len)
            while(j<len && s.charAt(j)==s.charAt(i)){
                count++;
                l.add(a[j]);
                j++;
            }
            if(count>k){
                Collections.sort(l);
                for(int d = 0;d<count-k;d++) sum-=l.get(d);
                l.clear();
            }
                i=j;
        }
        System.out.println(sum);
    }
}
