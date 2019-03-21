import java.util.Scanner;
public class dice {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int i =0;i<t;i++){
          int x = sc.nextInt();
          int k=0;
          if(x%2==0)
            k=x/2;
          else{
             if(x%3==1){
                 x=x-5;
                 k++;
                 k+=x/2;
             } 
             else if(x%3==2){
                    x-=2;
                    k++;
                    k+=x/2;
                 }
             else
                 k=x/3;
          }
          System.out.println(k);
      }
  }  
}
