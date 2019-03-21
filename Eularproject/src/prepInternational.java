import java.util.*;
/**
 *
 * @author Archit
 */
public class prepInternational {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        ArrayList<Long> l = new ArrayList<>();
        int count =0;
        for(int i =0;i<n;i++){
                boolean flag = false;
                long key = sc.nextLong();
                for(int j =0;j<l.size();j++){
                    if((key+l.get(j))%k==0){
                        flag=true;
                        count++;
                        l.remove(j);
                        break;
                    }
                }
                if(flag==false)l.add(key);
        }
        System.out.println(count*2);
    }
}
