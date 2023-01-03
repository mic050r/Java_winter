package thread.generate;

public class ThreadTest1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("thread 실행" + (i + 1));
			try {
				sleep(500);
			} catch (InterruptedException e) {

			} // 0.5초
		}
	}

	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1(); // new born 상태
		t1.start(); // runnable 상태
	}

}
