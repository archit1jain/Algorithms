//package experiment6;

import java.util.Scanner;

abstract class Themepark{
    int n ;
    int m;
    public Themepark(){
     n = m = 0;;
    }
    public Themepark(int n , int m){
        this.n = n;
        this.m = m;             
    }
    
    public void get(){
        System.out.println("enter the number of audlts :: "); 
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        System.out.println("enter the number of childrens :: ");
        m = sc.nextInt();  
    }
    public void TotalCost(){

        System.out.println( "Total cost is :" + n*500 + m*300);
    }
    abstract public void playGame();
    abstract public void display();
}
class Queensland extends Themepark{

    boolean Games[] = new boolean[30];
    public Queensland(){
        
        for(int i=0;i<30;i++){
            Games[i]= false;
        }
    }
    public Queensland(int adult , int child){
        super(adult , child);
        for(int i=0;i<30;i++){
            Games[i]= false;
        }
    }
    public void playGame(){
        
        int index=-1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Choose the game number to paly :");
            index = sc.nextInt();
            if(Games[index])
            {
                System.out.println("You already played this game , choose any other game to play" );
            }
        }while(Games[index]);
        
        System.out.println("enjoy the game");
        Games[index] = true; 
    }
     public void display(){
        int play=0, notplay=0;
        for(boolean game: Games){
            if(game)
                notplay++;
            else if(game)
                play++;    
        } 
        System.out.println("total count of games played :"+ play);
        System.out.println("total count of games not played :"+ notplay);

    }
}

class Veegaland extends Themepark{
    
    int Games[] = new int[40];
    public Veegaland(){
        super();
        for(int i=0;i<40;i++){
            Games[i]= 0;
        } 
    }
     public Veegaland(int adult , int child){
        super(adult,child);
        for(int i=0;i<40;i++){
            Games[i]= 0;
        } 
    }
    public void playGame(){
        System.out.println("Choose the game number to paly :");
        int index;
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();
        System.out.println("enjoy the game");
        Games[index]++;     
    }
    public void display(){
        int play=0, notplay=0;
        for(int game: Games){
            if(game ==0)
                notplay++;
            else if(game>=1)
                play++;    
        } 
        System.out.println("total count of games That was repreated :"+ play);
        System.out.println("total count of games not played :"+ notplay);

    }
    

}
public class game {
    public static void main(String[] args) {
        Themepark t ;
        boolean play= true;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter which park you want to go 1.Veegaland\n2.Queensland");
        int park= sc.nextInt();
        if(park==2)
        t = new Queensland( 3,3);
        else
            t= new Veegaland(3,3);
            
        t.TotalCost();
        do{
            t.playGame();
            System.out.println("if want to play more enter 1");
            int more = sc.nextInt();
            if(more !=1)
                play= false;          
        }while(play);
        t.display();
        
    }
    
}
