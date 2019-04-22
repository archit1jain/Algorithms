import java.util.*;
public class lab {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        List<Long> l = new ArrayList<>();
        l.add((long)1);
        for(long i =1;i<=a+1;i++){
            l.add(i*(l.get(l.size()-1)));
        }
        System.out.println(l);
        long b1 =0;
        for(int i =1;i<=a-b+1;i++){
            b1+=((l.get((int) (i+b))/(l.get(i))));
        }
        System.out.println(b1);
    }
    
}
