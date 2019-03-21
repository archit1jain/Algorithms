
public class pythagoreanTriplet {
   public static void main(String[] args){
       /*
       c->1000-a-b
      2000a+2000b= 1000^2+2ab
       1000(a+b)=500000+ab;
       1000a-ab=-1000b+500000
       a(1000-b)=1000(500-b)
       a = 1000(500-b)/(1000-b)
       */
       int a;
       int b=2;
       while(true){
           if( b!=1000) 
           if(1000*(500-b)%(1000-b)==0){
               a = 1000*(500-b)/(1000-b);
                if(a<b){
                  System.out.println(a);
                  System.out.println(b);
                  System.out.println(1000-a-b);
                  System.out.println(a*b*(1000-a-b));
                break;
                }    
           }
           b++;
       }
   } 
}
