import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class rearrangeString {
    public static boolean isPalindrome(String s) {
    int n = s.length();
    s = s.toLowerCase();
    for (int i = 0; i < (n / 2) + 1; ++i) {
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= sc.nextInt();
        String s;
        for(int j =0;j<t;j++){
            s = sc.nextLine();
            System.out.println(s);
        if(!isPalindrome(s)){
            System.out.println(s);
        }
        else{
            boolean flag = false;
            char a=s.charAt((s.length()/2));
            for(int i=(s.length()/2);i>=0;i--){
                if(a!=s.charAt(i)){
                    System.out.println(s.substring(0,i)+a+s.substring(i+1,s.length()/2)+s.charAt(i)+s.substring((s.length()/2)+1));
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(-1);
            }
           
        }
        }
    }
    
}
