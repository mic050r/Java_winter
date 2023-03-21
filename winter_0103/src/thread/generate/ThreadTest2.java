package thread.generate;

public class ThreadTest2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Runnable을 사용한 Thread 실행 " + (i + 1));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 0.2초
		}
	}

	public static void main(String[] args) {
		ThreadTest2 t2 = new ThreadTest2();
		Thread t3 = new Thread(t2); // new born 상태
		t3.start(); // runnable 상태
	}

}
