import java.util.*;
public class primeSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        int i =3;
        int sum =2;
        while(i!=n){
            for(int j =0;j<l1.size();j++){
                if(i%l1.get(j)==0)
                    break;
                if(j==l1.size()-1){
                    l1.add(i);
                    sum+=i;
                    
                }
                    
            }
            i++;
        }
        System.out.println(sum);
    }
}
