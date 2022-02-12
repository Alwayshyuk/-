/*
 * 2022-02-12  22:24
 * 자바의 정석 연습문제 7-18
 */


package E7;

public class E7_18 {
	
 //	static void action(Robot r) {
//		if(r instanceof DanceRobot)
//			DanceRobot.dance();
//		if(r instanceof SingRobot)
//			SingRobot.sing();
//		if (r instanceof DrawRobot)
//			DrawRobot.draw();
//	}
	static void action(Robot r) {
	if(r instanceof DanceRobot) {
		DanceRobot dr = new DanceRobot();
		dr.dance();
	} else if(r instanceof SingRobot) {
		SingRobot sr = new SingRobot();
		sr.sing();	
	} else if (r instanceof DrawRobot) {
		DrawRobot dr = new DrawRobot();
		dr.draw();
	}
}
	
	public static void main(String[] args) {
		Robot [] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i = 0; i<arr.length; i++) {
			action(arr[i]);
		}

	}

}
class Robot { }
class DanceRobot extends Robot{
	void dance() {
		System.out.println("dance ~.~");
	}
}
class SingRobot extends Robot{
	void sing() {
		System.out.println("sing ~.~");
	}
}
class DrawRobot extends Robot{
	void draw() {
		System.out.println("Draw ~.~");
	}
}