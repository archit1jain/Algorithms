import java.util.*;
public class divMod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i;
        for(i=k-1;i>=0;i--){
            if(n%i==0)
                break;
        }
        System.out.println(n*k/i + i);
    }
}
