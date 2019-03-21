class reciever implements Runnable 
{ 
    Q q; 
    reciever(Q q){ 
        this.q = q; 
        new Thread(this, "Reciever").start(); 
    } 
      
    @Override
    public void run() 
    { 
        for(int i=0; i < 5; i++)   
            q.get(); 
    } 
} 