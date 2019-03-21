import java.util.*;
public class superherTransfor {
    static boolean check(char c){
        char[] a = {'a','e','i','o','u'};
        for(int i =0;i<5;i++){
            if(c==a[i])
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if(s.length()==t.length()){
            int l = s.length();
            for(int i =0;i<l;i++){
              if(check(s.charAt(i)) && !check(t.charAt(i))){
                  System.out.println("No");
                  return;
              }
              else if(!check(s.charAt(i)) && check(t.charAt(i))){
                  System.out.println("No");
                  return;
              }
            }
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
