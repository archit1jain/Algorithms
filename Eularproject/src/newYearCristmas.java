import java.util.*;
import java.lang.*;
import static jdk.nashorn.internal.objects.NativeMath.min;
public class newYearCristmas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        while(y+1>b || y+2>r){
            y--;
        }
        System.out.println(3*y+3);
        
    }
}
