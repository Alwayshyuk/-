package practice;

public class ThreadEx15 {

	public static void main(String[] args) {
		RunImplEx15 r = new RunImplEx15();
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");

		th1.start();
		th2.start();
		th3.start();
		
		try {
			System.out.println();
			Thread.sleep(2000);
			System.out.println();
			th1.suspend();	//쓰레드 th1을 잠시 정지시킨다.
			Thread.sleep(2000);
			System.out.println();
			th2.suspend();
			Thread.sleep(3000);
			System.out.println();
			th1.resume();	//쓰레드 th1을 다시 동작하도록 한다.
			Thread.sleep(3000);
			System.out.println();
			th1.stop();		//쓰레드를 강제종료시킨다.
			th2.stop();
			Thread.sleep(2000);
			System.out.println();
			th3.stop();
		} catch (InterruptedException e) {}
	}

}
class RunImplEx15 implements Runnable{
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}