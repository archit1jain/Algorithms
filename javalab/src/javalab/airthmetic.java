package javalab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class airthmetic {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void at(int a,int b) throws IOException{
        System.out.println("Enter operation you want to do\n 0 to Add\n 1 to sub\n 2 to multiply\n 3 to divide\n" );
     int ch;
        ch = Integer.parseInt(br.readLine());
     switch(ch){
         case 0:  a=a+b;
                  System.out.println("result is: "+ a);
                  break;
         case 1:  a=a-b;
                  System.out.println("result is: "+ a);
                  break;
         case 2:  a=a*b;
                  System.out.println("result is: "+ a);
                  break;
         case 3:  a=a/b;
                  System.out.println("result is: "+ a);
                  break;
         default: System.out.println("You haven't choosen any operation.\n");
                    break;
                  
        
        
    }
    }
 public static void main(String[] args) throws IOException{
     
     int ch,a,b;
     System.out.println("Enter two integers \n" );
     a=Integer.parseInt(br.readLine());
     b=Integer.parseInt(br.readLine());
     at(a,b);
     }
 }
