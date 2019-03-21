/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eularproject;

import java.util.Scanner;

/**
 *
 * @author Archit
 */
public class prob1 {
    public static void main(String[] args){
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i =1;i<n;i++){
            if(i%3==0 || i%5==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        
        
    }
    
}
