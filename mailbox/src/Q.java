import java.util.concurrent.Semaphore; 
class Q 
{ 
    int item; 
    static Semaphore semCon = new Semaphore(0);   
    static Semaphore semProd = new Semaphore(1); 
    void get() 
    { 
        try { 
            semCon.acquire(); 
        }  
        catch(InterruptedException e) { 
            System.out.println("InterruptedException caught"); 
        } 
        System.out.println("Reciever recieved : " + item); 
          
        semProd.release(); 
    } 
    void put(int item) 
    { 
        try {
            semProd.acquire(); 
        } catch(InterruptedException e) { 
            System.out.println("InterruptedException caught"); 
        } 
        this.item = item; 
          
        System.out.println("Sender sends : " + item); 
        semCon.release(); 
    } 
} 