import java.util.*;
public class primeSum2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        int i =3;
        long sum =2;
        while(i!=n){
            int j = (int)Math.sqrt(i);
            int k =0;
            int flag =0;
            while(l1.get(k)<=j){
                if(i%l1.get(k)==0)
                    flag=1;
                k++;
                if(k>l1.size()-1)
                    break;
            }
            if(flag==0){
                l1.add(i);
                sum+=i;
            }
                
            i++;
        }
        System.out.println(sum);
    }
}
