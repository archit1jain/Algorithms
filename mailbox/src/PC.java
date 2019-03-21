class PC 
{ 
    public static void main(String args[])  
    { 
        Q q = new Q();  
        new Sender(q); 
        new Sender(q);
        new reciever(q); 
        
    } 
} 