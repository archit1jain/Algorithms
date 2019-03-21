import java.util.*;
public class polygonAngle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            for(int j =3;j<400;j++){
                if(((180-n)*j)%180==0 && ((180-n)*j)/180<=j-1 && ((180-n)*j)/180>1){
                    System.out.println(j);
                    break;
            }
            }
        }
    }
}
