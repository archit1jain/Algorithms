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
public class lostNumbers {
    static boolean contain(int[] a, int b){
        for(int i =0;i<a.length;i++)
            if(a[i]==b)return true;
        return false;
    }
    static int god(int a, int b) 
    { 
        int[] ar = {42,23,16,15,8,4};
        for(int i =0;i<6;i++){
            if(a%ar[i]==0 && b%ar[i]==0 && contain(ar,a/ar[i]) && contain(ar,b/ar[i]) && ar[i]!=(a/ar[i]) && ar[i]!=(b/ar[i])){
                return ar[i];
            }
        }
        return 0;
    } 
    public static void main(String[] args){
        /*
        38,60,64,
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("? " +1 + " "+2 );
        System.out.flush();
        int a = sc.nextInt();
        System.out.println("? " +2 + " "+3 );
        System.out.flush();
        int b = sc.nextInt();
        System.out.println("? " +4 + " "+5 );
        System.out.flush();
        int c = sc.nextInt();
        System.out.println("? " +5 + " "+6 );
        System.out.flush();
        int d = sc.nextInt();
        int[] ans = new int[6];
        ans[1]=god(a,b);
        ans[4]= god(c,d);
        ans[0]= a/ans[1];
        ans[2]=b/ans[1];
        ans[3]= c/ans[4];
        ans[5]=d/ans[4];
        System.out.print("! ");
        for(int i =0;i<6;i++)
        System.out.print(ans[i]+" ");
        System.out.flush();
        
        
    }
}
