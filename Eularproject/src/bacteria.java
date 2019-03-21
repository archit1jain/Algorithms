import java.util.Scanner;
public class bacteria {
  static boolean isPower2(int x){
return (int)(Math.ceil((Math.log(x) / Math.log(2)))) == (int)(Math.floor(((Math.log(x) / Math.log(2))))); 
  }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n =0;
      int x = sc.nextInt();
      if(x!=0){
          if(isPower2(x)){
              n = 1;
          }
          else{
              if(isPower2(x-1) || isPower2(x-2)){
                  n = 2;
              }
              else
                  n = 3;
          }
      }
      System.out.println(n);    
  }  
}