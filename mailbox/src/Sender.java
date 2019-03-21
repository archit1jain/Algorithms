class Sender implements Runnable 
{ 
    Q q; 
    Sender(Q q) { 
        this.q = q; 
        new Thread(this, "Sender").start(); 
    } 
      
    @Override
    public void run() { 
        for(int i=0; i < 5; i++)   
            q.put(i); 
    } 
} 