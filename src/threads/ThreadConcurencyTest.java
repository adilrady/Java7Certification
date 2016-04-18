package threads;

class Count {
	public static long count = 0;
}

class MyThread implements Runnable {
	public void increment() {
//		synchronized(Count.class){
			Count.count++;
			System.out.print(Count.count + " ");
//		}
	}

	public void run() {
		increment();
		increment();
		increment();
	}
}

// This class creates three threads
public class ThreadConcurencyTest {
	public static void main(String args[]) {
		MyThread c = new MyThread();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}
