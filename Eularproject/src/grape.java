import java.util.*;
public class grape {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),d = sc.nextInt(),m = sc.nextInt();
        int g = sc.nextInt(),p = sc.nextInt(),b = sc.nextInt();
        if(g<a){
            System.out.println("NO");
            return;
        }
        else{
            g-=a;
        }
        p=p+g;
        if(d>p){
            System.out.println("NO");
            return;
        }
        else{
            p-=d;
        }
        b+=p;
        if(m>b)System.out.println("NO");
        else System.out.println("YES");
    }
}
