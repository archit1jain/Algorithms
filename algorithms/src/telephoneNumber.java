/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Archit
 */
import java.util.*;
public class telephoneNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 0;t<test;t++){
            int n = sc.nextInt();
            String s = sc.next().trim();
            boolean flag = false;
            for(int i =0;i<=n-11;i++){
                if(s.charAt(i)=='8'){
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }
            if(!flag)System.out.println("NO");
        }
    }
}
