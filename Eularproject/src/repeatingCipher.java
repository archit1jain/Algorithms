import java.io.*;
import java.util.*;
public class repeatingCipher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine().trim();
        String s1 ="";
        int i =0,m=0;
        while(i!=n){
            s1+=s.charAt(i);
            // 0+1+2+3
            m++;
            i+=m;
        }
        System.out.println(s1);
        
    }
}
