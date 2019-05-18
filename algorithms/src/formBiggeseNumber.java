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
public class formBiggeseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt =0;tt<t;tt++){
          int n = sc.nextInt();
          String[] s = new String[n];
          String[] scopy = new String[n];
          int max = 0;
          for(int j =0;j<n;j++){
              String key = sc.next().trim();
              max = Math.max(key.length(),max);
              s[j]=key;
              scopy[j]= key;
          }
          String zero = "000000000000000000000";
          for(int i =0;i<n;i++){
              s[i]=s[i]+zero.substring(0,max-s[i].length());
          }
          for(int i =0;i<n;i++){
              for(int j =0;j<n;j++){
                  if(s[i].compareTo(s[j])>=0){
                      String temp = s[i];
                      s[i]=s[j];
                      s[j]=temp;
                      temp = scopy[i];
                      scopy[i]=scopy[j];
                      scopy[j]=temp;
                  }
              }
          }
          /*
          98 9 985 ->    998985  
          */
          for(int i =0;i<n;i++)
              System.out.print(scopy[i]);
              
              
        }
    }
}
