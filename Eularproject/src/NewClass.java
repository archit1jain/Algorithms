import java.util.*;
public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q!=0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();
            int i = d;
            if(i<l){
                System.out.println(i);
            }
            else{
                i = (int)Math.ceil((double)(r+1)/d);
                i*=d;
                System.out.println(i);
                
            }
            q--;
        }
    }
}
