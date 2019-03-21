import java.util.*;
/**
 *
 * @author Archit
 */
public class prize {
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1000);
        map.put(2,5000);
        map.put(3,4000);
        map.put(4,9000);
        map.put(5,2000);
        map.put(6,7000);
        map.put(7,3000);
        map.put(8,8000);
        map.put(9,6000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : " );
        int n = sc.nextInt();
        int p = (int) (Math.random()*10);
        p=p%10;
        System.out.println("Prize won: "+map.get(p));
        
    }
}
