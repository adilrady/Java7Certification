package threads;

public class JoinExample implements Runnable {
	    public static void main(String[] args) throws InterruptedException {
	        Thread a = new Thread(new JoinExample());
	        a.start();
	        
	        System.out.print("Begin");
	        a.join();
	        System.out.print("End");
	    }
	    
	    public void run() {
	        System.out.print("Run");
	    }
}
