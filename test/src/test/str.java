/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Archit
 */
public class str {
    public static void main(String[] args){
        String s = "archit";
        String s1 = "archit";
        String s2 = "archit";
        System.out.println(s2.equals(s));
        System.out.println(s1.equals(s));
        char[] carray = s.toCharArray();
        for(char c : carray){
            System.out.print(c);
            
        }
    System.out.println();
    }
    
    
}
