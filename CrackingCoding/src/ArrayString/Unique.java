package ArrayString;
import java.util.*;
public class Unique {
    public static void main(String[] args){
        int[] a = new int[26];
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i =0;i<s.length();i++){
            int j = (int)s.charAt(i)-97;
            if(a[j]==0) a[j]++;
            else {System.out.println("Not Unique");return;}
        }
        System.out.println("Unique");
    }
}
