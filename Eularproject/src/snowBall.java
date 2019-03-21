import java.util.*;
public class snowBall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(),h = sc.nextInt(),u1 = sc.nextInt(),d1 = sc.nextInt(),u2 = sc.nextInt(),d2 = sc.nextInt();
        while(h!=0){
            w+=h;
            if(h==d1){
                w-=u1;
            }
            else if(h==d2){
                w-=u2;
            }
            if(w<0)
                w=0;
            h--;
        }
        System.out.println(w);
    }
}
