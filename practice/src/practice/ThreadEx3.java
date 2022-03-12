package practice;

public class ThreadEx3 {

	public static void main(String[] args) {
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run();
		//java.lang.Exception
		//at tmp.ThreadEx3_1.throwException(ThreadEx3.java:17)
		//at tmp.ThreadEx3_1.run(ThreadEx3.java:13)
		//at tmp.ThreadEx3.main(ThreadEx3.java:7)
	}
}
class ThreadEx3_1 extends Thread	{
	public void run() {
		throwException();
	}
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
