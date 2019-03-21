
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Archit
 */
public class tortoisehere {
    public static void main(String[] args){
     Thread mt1 = new Thread(){
         @Override
         public void run(){
             for(int i =0;i<1000;i++){};
             System.out.println("1 win");
         }
     };
     Thread mt2 = new Thread(){
         @Override
         @SuppressWarnings("empty-statement")
         public void run(){
             for(int i =0;i<500;i++){};
             try{
                 Thread.currentThread().sleep(1000);
             } catch (InterruptedException ex) {
                 Logger.getLogger(tortoisehere.class.getName()).log(Level.SEVERE, null, ex);
             }
             for(int i =0;i<500;i++){};
             System.out.println("2 win");
         }
     };
     mt1.start();
     mt2.start();
}
}
