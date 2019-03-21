/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t!=0){
            int[] a = new int[4];
            String[] s = (br.readLine().trim()).split(" ");
            for(int i =0;i<4;i++) a[i] = Integer.parseInt(s[i].trim());
            int m = (((a[0]-a[1])/a[1])+1)+(((a[0]-a[2])/a[2])+1)-2*(((a[0]-(a[1]*a[2]))/(a[1]*a[2]))+1);
            if(m>=a[3])System.out.println("Win");
            else System.out.println("Lose");
        
            t--;
            
        }
	}
}
