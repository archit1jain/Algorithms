/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Archit
 */
public class pattern {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = br.readLine();
        String[] arr = s.split(" ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
