import java.applet.*;
import java.awt.*;


public class Main_1 extends Applet implements Runnable
 {
 Thread t;
 int x = 0;
 int y = 0;
int p=0,q=0,r=0;

public void start()
 {
 t = new Thread(this);
 t.start();
 }

public void paint(Graphics g)
   {
try{
Color custom=new Color(p,q,r);
g.setColor(custom);
g.fillOval(x,y,100,100);
if(p==240)
{p=0;q=0;r=0;
}
else
{
p=p+20;
q=q+20;
r=r+20;

}


}
catch(Exception e)
{}
    }

public void run()
 {
   try
      {
      for(;;)
       {
                for(;;)
            {
                 if(y == 120)
                     {
                      break;
                     }
    else if (x == 390)
        {
     x = 0;
     y = 0;
    repaint();
         }
                    else
                     {
                      y = y + 3;
                   
                     Thread.sleep(100);
               repaint();
		
               }
                }
           for(;;)
              {
               if(y==0)
                   {
                        break;
                        }
               else if (x == 390)
           {
          x = 0;
          y = 0;
                 repaint();
    }
    else
                 {
        y = y-3;
             
               Thread.sleep(100);
                repaint();
               }
                } 
            run();
       }
  }

catch(InterruptedException e)
    {

    }
 }
}