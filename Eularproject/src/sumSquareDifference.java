import java.util.*;
public class sumSquareDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = (int) (Math.pow(n*(n+1)/2,2)-n*(n+1)*(2*n+1)/6);
        System.out.println(n);
    }
}
