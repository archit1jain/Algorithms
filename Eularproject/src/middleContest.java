import java.util.*;
/**
 *
 * @author Archit
 */
public class middleContest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(":");
        String[] s1 = sc.nextLine().split(":");
        int h1 = Integer.parseInt(s[0].trim());
        int m1 = Integer.parseInt(s[1].trim());
        int h2 = Integer.parseInt(s1[0].trim());
        int m2 = Integer.parseInt(s1[1].trim());
        int start = h1*60+m1;
        int end = h2*60+m2;
        int mid = (start+end)/2;
        int midm=mid%60,midh=mid/60;
        if(midm<10 && midh <10)System.out.println("0"+midh+":0"+midm);
        else if(midm<10)System.out.println(midh+":0"+midm);
        else if(midh <10)System.out.println("0"+midh+":"+midm);
        else System.out.println(midh+":"+midm);
        
        
        
        
    }
}
