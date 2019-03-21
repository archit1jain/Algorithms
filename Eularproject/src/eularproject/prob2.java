import java.io.*;
package eularproject;
public class prob2 {
    static long evenFibSum(long limit) 
    { 
        if (limit < 2) 
            return 0; 
        long ef1 = 0, ef2 = 2; 
        long sum = ef1 + ef2; 
        while (ef2 <= limit) 
        { 
            long ef3 = 4 * ef2 + ef1; 
            if (ef3 > limit) 
                break; 
            ef1 = ef2; 
            ef2 = ef3; 
            sum += ef2; 
        } 
      
        return sum; 
    } 
    public static void main (String[] args)  
    { 
        long limit = 4000000; 
        System.out.println(evenFibSum(limit));           
    } 
} 