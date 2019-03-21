import java.util.*;
public class plant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        /*
        2*4 +            1*4 = 12 
        (3+4+3)*4 +     2*4 = 48
        n*(n+1)*(n+2)*(n+3)/3
        */
        int i=0,l = 0;
        while(x>l){
            i++;
            l = i*(i+1)*(i+2)*(i+3);l/=2;
        }
        System.out.println(8*i);
    }
}
