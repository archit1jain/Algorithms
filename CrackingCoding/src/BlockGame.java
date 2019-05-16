import java.util.*;
/**
 *
 * @author Archit
 */
public class BlockGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            t--;
            int n = sc.nextInt();
            String s =String.valueOf(n);
            if(palin(s)){
                System.out.println("wins");
            }
            else{
                System.out.println("losses");
            }
        }
    }

    public static boolean palin(String s) {
       int l = s.length();
       for(int i =0;2*i+1<l;i++){
           if(s.charAt(i)!=s.charAt(l-i-1)) return false;
       }
        return true;
    }
}
