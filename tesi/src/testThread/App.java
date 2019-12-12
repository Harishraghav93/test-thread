package testThread;

public class App {
	public static int balance=0;
	
	public void withdraw(int amount)  {
		synchronized(this){
		if(balance==0) {
			System.out.println("Waiting for the deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		balance= balance - amount;
		System.out.println("Money is deposited and remaining bal  ="+balance);
	}
	
	public void deposit(int amount) {
		synchronized(this){
		balance = balance + amount;
		System.out.println("Money is deposited");
		notifyAll();
	}
	}

	public static void main(String[] args) {
		App k = new App();
		Thread th1 = new Thread(new Runnable() {
	      public void run() {
	    	  k.withdraw(1000);
	      }
		
	});
		th1.start();
		
		Thread th2 = new Thread(new Runnable() {
		      public void run() {
		    	  k.deposit(2000);
		      }
			
		});
			th2.start();

}
}