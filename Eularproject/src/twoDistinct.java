import java.util.*;
public class twoDistinct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2=sc.nextInt();
            System.out.print(l1);
            System.out.print(" ");
            if(l1!=l2) System.out.print(l2);
            else System.out.print(r2);
            System.out.println();
            t--;
        }
    }
}
