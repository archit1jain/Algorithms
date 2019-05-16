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
public class pileStones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next().trim();
        int c =0;
        for(int i =0;i<n;i++){
            if(s.charAt(i)=='-'){c--;if(c<0)c=0;}
            if(s.charAt(i)=='+')c++;
        }
        System.out.println(c);
    }
}
