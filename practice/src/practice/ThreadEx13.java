package practice;

import javax.swing.JOptionPane;

public class ThreadEx13 {

	public static void main(String[] args) throws Exception {
		ThreadEx13_1 t1 = new ThreadEx13_1();
		t1.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " +input+"입니다.");
		t1.interrupt();	//interrupt()를 호출하면, interrupted가 true가 된다.
		System.out.println(t1.isInterrupted());
	}
}
class ThreadEx13_1 extends Thread	{
	public void run() {
		int i = 10;
		int a = 0;
		while(i !=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x = 0 ; x<2500000000L; x++) {
				a+=x;
			};
			
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}
