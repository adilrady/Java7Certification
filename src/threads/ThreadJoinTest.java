package threads;

public class ThreadJoinTest {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("Master ");
		Thread worker = new Worker();
		worker.setName("Worker ");
		worker.start();
		Thread.currentThread().join(); //Program hangs here, it joins itself
//		System.out.println(Thread.currentThread().getName());
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}

class Worker extends Thread {
	public void run() {
//		System.out.println(Thread.currentThread().getName());
	}
}