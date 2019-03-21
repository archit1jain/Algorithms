
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
public class TestjoinMethod extends Thread {
    @Override
    public void run(){
        for(int i =0;i<5;i++){
            try{
                    Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
            }
            
        }
    public static void main(String[] args) throws InterruptedException{
        TestjoinMethod t1 = new TestjoinMethod();
        TestjoinMethod t2 = new TestjoinMethod();
        TestjoinMethod t3 = new TestjoinMethod();
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){System.out.println(e);}
        t2.start();
        t3.start();
        
        
    }
    
}
