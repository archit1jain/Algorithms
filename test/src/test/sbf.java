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
public class sbf {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("HEllo");
        System.out.println("Buffer value: " + sb);
        sb.appendCodePoint(65);
        System.out.println("Buffer value: " + sb);
        
        
    }
    
}
