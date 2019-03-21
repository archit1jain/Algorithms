import java.util.*;
public class gameSTring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count =0;
        String s = sc.nextLine();
        int l = s.length();
        int i =0;
        int j =1;
        while(j<l){
            if(s.charAt(i)==s.charAt(j)){
                while(i>=0 && j<l && s.charAt(i)==s.charAt(j)){
                    i--;
                    j++;
                    count++;
                }
                s=s.substring(0,i+1) + s.substring(j);
                l = s.length();
                i=0;j=1; 
            }
            else{
                i++;
                j++;
            }
            
        }
        if(count%2==0) System.out.println("No");
        else System.out.println("Yes");
    }
}
