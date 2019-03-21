import java.util.Arrays;
public class runner {
	public static void main(String[] args) throws InterruptedException{
		int ar[]=new int[240];
		for(int i=0; i<240; i++) {
			ar[i] = (int)(Math.random()*3 + 1);
		}
		Thread t1=new counter(ar);
		t1.setName("One");
		t1.start();
		Thread t2=new counter(ar);
		t2.setName("Two");
		t2.start();
		Thread t3=new counter(ar);
		t3.setName("Three");
		t3.start();
		Thread t4=new counter(ar);
		t4.setName("Four");
		t4.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		int a=counter.counta;
		int b=counter.countb;
		int c=counter.countc;
		System.out.println(a+" "+" "+b+" "+" "+c);
		System.out.println(Arrays.toString(ar));
		if(a>b && a>c)
			System.out.println("A is the PR");
		else if(b>c && b>a)
			System.out.println("B is the PR");
		else
			System.out.println("C is the PR");
}
}
class counter extends Thread{
	static int ar[]=new int[240];
	static int counta=0,countb=0,countc=0;
	counter(int[] ar){
		this.ar=ar;
	}

        @Override
	public void run() {
		Thread t=Thread.currentThread();
		if(t.getName().equalsIgnoreCase("One"))
			count(0, 59, ar);
		else if(t.getName().equalsIgnoreCase("Two"))
			count(60, 119, ar);
		else if(t.getName().equalsIgnoreCase("Three"))
			count(120,179 , ar);
		else if(t.getName().equalsIgnoreCase("Four"))
			count(180,239, ar);
	}
	public synchronized void count(int start,int end, int ar[]) {
		for(int i=start;i<=end;i++) {
			if(ar[i]==1)
				counta++;
			else if(ar[i]==2)
				countb++;
			else if(ar[i]==3)
				countc++;
			
		}
	}
	
}