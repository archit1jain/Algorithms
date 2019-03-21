import java.util.*;
public class anotherConstruction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int a =1;a<=x;a++){
            for(int b =1;b<=x;b++){
                if(a%b==0 && a*b>x && a/b<x){
                    System.out.print(a);
                    System.out.print(" ");
                    System.out.print(b);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
