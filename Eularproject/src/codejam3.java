import java.util.*;
public class codejam3 {
    public static List<Integer> prime(int n){
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        int i =3;
        while(i<=n){
            int j=0;
            for(j =0;j<l1.size();j++){
                if(i%l1.get(j)==0)
                    break;       
                }
             if(j==l1.size()){
                    l1.add(i); 
            }
            i++;
        }
        return l1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        List<Integer> l = prime(10001);
        while(n!=0){
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] a = new int[k][2];
            SortedSet<Integer> s = new TreeSet<>();
            for(int j =0;i<k;j++){
                int key = sc.nextInt();
                for(int c =0;c<l.size();c++){
                    if(key%l.get(c)==0){a[j][0]}
                }
            }
            n--;i++;
        }
        
    }
}
