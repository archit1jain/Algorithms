import java.math.BigInteger;
import java.util.*;
public class codeJam1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int j =1;
        while(n!=0){
            String s = sc.nextLine().trim();
            StringBuilder s1 = new StringBuilder();
            for(int i =0;i<s.length();i++){
                if(s.charAt(i)=='4')s1.append("1");
                else s1.append("0");
            }
            s=s.trim();
            BigInteger b = BigInteger.valueOf(Long.parseLong(s));
            BigInteger b1 = BigInteger.valueOf(Long.parseLong(s1.toString()));
            System.out.println("Case #"+j+": "+ b1 + " " + b.subtract(b1));
            n--;
            j++;
        }
    }
}
