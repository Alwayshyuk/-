package practice;

import javax.swing.JOptionPane;
public class ThreadEx6 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.printf("입력하신 값은 %s 입니다.\n", input);
		
		for(int i = 10; i>0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);	//1초간 시간을 지연시킨다.
			} catch (Exception e) {}
		}
		//입력하신 값은 헤헿 입니다.	10	9	8	7	6	5	4	3	2	1
	}
}
