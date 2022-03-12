package practice;

import javax.swing.JOptionPane;
public class ThreadEx7 {

	public static void main(String[] args) {
		ThreadEx7_1 t1 = new ThreadEx7_1();
		t1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.printf("입력하신 값은 %s 입니다.\n", input);
		//10	9	8	7	입력하신 값은 아무 값이나 입니다.	6	5	4	3	2	1
	}
}
class ThreadEx7_1 extends Thread{
	public void run()	{
		for(int i = 10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}