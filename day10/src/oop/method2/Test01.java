package oop.method2;

public class Test01 {

	public static void main(String[] args) {
		Medal m1 = new Medal();
		Medal m2 = new Medal();
		Medal m3 = new Medal();
		

		m1.setting(1, "노르웨이", 16, 8, 13);
		m2.setting(2, "독일", 12, 10, 5);
		m3.setting(3, "중국", 9, 4, 2);
		
		m1.print();
		m2.print();
		m3.print();
	}

}
