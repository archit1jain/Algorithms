/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayString;
import java.util.*;
public class checkPermu {
    static boolean check(String s,String s1){
        int[] a = new int[26];
        if(s1.length()!=s.length()) return false;
        for(int i =0;i<s.length();i++){
            a[(int)s.charAt(i)-97]++;
        }
        for(int i =0;i<s1.length();i++){
            a[(int)s.charAt(i)-97]--;
        }
        for(int i =0;i<s1.length();i++){
            if(a[i]!=0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        if(check(s,s1)) System.out.println("Yes");
        else System.out.println("No");
    }
}
