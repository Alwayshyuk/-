package oop.method4;

public class Test01 {

	public static void main(String[] args) {
		Menu a = new Menu();
		Menu b = new Menu();
		Menu c = new Menu();
		Menu d = new Menu();
		
		a.setting("아메리카노", "음료", 2500, true);
		b.setting("모카라떼", "음료", 3500);
		c.setting("치즈케이크", "디저트", 5000, true);
		d.setting("마카롱", "디저트", 5000);

		
		a.print();
		System.out.println("--------------");
		b.print();
		System.out.println("--------------");
		c.print();
		System.out.println("--------------");
		d.print();
	}

}
